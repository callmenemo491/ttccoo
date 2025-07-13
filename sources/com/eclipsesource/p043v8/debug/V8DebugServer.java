package com.eclipsesource.p043v8.debug;

/* loaded from: classes.dex */
public class V8DebugServer {
    private static final java.lang.String DEBUG_BREAK_HANDLER = "__j2v8_debug_handler";
    public static java.lang.String DEBUG_OBJECT_NAME = "__j2v8_Debug";
    private static final java.lang.String HEADER_EMBEDDING_HOST = "Embedding-Host: ";
    private static final java.lang.String HEADER_PROTOCOL_VERSION = "Protocol-Version: ";
    private static final java.lang.String HEADER_TYPE = "Type: ";
    private static final java.lang.String HEADER_V8_VERSION = "V8-Version: ";
    private static final java.lang.String J2V8_VERSION = "4.0.0";
    private static final java.lang.String MAKE_BREAK_EVENT = "__j2v8_MakeBreakEvent";
    private static final java.lang.String MAKE_COMPILE_EVENT = "__j2v8_MakeCompileEvent";
    private static final int PROTOCOL_BUFFER_SIZE = 4096;
    private static final java.nio.charset.Charset PROTOCOL_CHARSET = null;
    private static final byte[] PROTOCOL_CONTENT_LENGTH_BYTES = null;
    private static final java.lang.String PROTOCOL_CONTENT_LENGTH_HEADER = "Content-Length:";
    private static final java.lang.String PROTOCOL_EOL = "\r\n";
    private static final byte[] PROTOCOL_EOL_BYTES = null;
    private static final java.lang.String PROTOCOL_VERSION = "1";
    private static final java.lang.String SET_LISTENER = "setListener";
    private static final java.lang.String V8_DEBUG_OBJECT = "Debug";
    private static final java.lang.String V8_VERSION = "4.10.253";
    private java.net.Socket client;
    private java.lang.Object clientLock;
    private com.eclipsesource.p043v8.V8Object debugObject;
    private java.util.List<java.lang.String> requests;
    private com.eclipsesource.p043v8.V8Object runningStateDcp;
    private com.eclipsesource.p043v8.C1032V8 runtime;
    private java.net.ServerSocket server;
    private com.eclipsesource.p043v8.V8Object stoppedStateDcp;
    private boolean traceCommunication;
    private boolean waitForConnection;

    /* renamed from: com.eclipsesource.v8.debug.V8DebugServer$1 */
    public static /* synthetic */ class C10341 {
    }

    public class ClientLoop implements java.lang.Runnable {
        private int from;
        public final /* synthetic */ com.eclipsesource.p043v8.debug.V8DebugServer this$0;

        private ClientLoop(com.eclipsesource.p043v8.debug.V8DebugServer r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ ClientLoop(com.eclipsesource.p043v8.debug.V8DebugServer r1, com.eclipsesource.p043v8.debug.V8DebugServer.C10341 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private int indexOf(byte[] r5, byte[] r6, int r7, int r8) {
                r4 = this;
                int r0 = r5.length
            L1:
                if (r7 >= r8) goto L1a
                r1 = 0
            L4:
                if (r1 > r0) goto L17
                if (r1 != r0) goto L9
                return r7
            L9:
                int r2 = r7 + r1
                if (r2 >= r8) goto L17
                r2 = r6[r2]
                r3 = r5[r1]
                if (r2 == r3) goto L14
                goto L17
            L14:
                int r1 = r1 + 1
                goto L4
            L17:
                int r7 = r7 + 1
                goto L1
            L1a:
                r5 = -1
                return r5
        }

        private byte[] join(byte[] r4, byte[] r5, int r6, int r7) {
                r3 = this;
                int r0 = r4.length
                int r0 = r0 + r7
                byte[] r0 = new byte[r0]
                int r1 = r4.length
                r2 = 0
                java.lang.System.arraycopy(r4, r2, r0, r2, r1)
                int r4 = r4.length
                java.lang.System.arraycopy(r5, r6, r0, r4, r7)
                return r0
        }

        private void processClientRequests() {
                r11 = this;
                r0 = 0
                byte[] r1 = new byte[r0]
                r2 = 4096(0x1000, float:5.74E-42)
                byte[] r2 = new byte[r2]
                com.eclipsesource.v8.debug.V8DebugServer r3 = r11.this$0
                java.lang.Object r3 = com.eclipsesource.p043v8.debug.V8DebugServer.access$700(r3)
                monitor-enter(r3)
                com.eclipsesource.v8.debug.V8DebugServer r4 = r11.this$0     // Catch: java.lang.Throwable -> L8a
                java.net.Socket r4 = com.eclipsesource.p043v8.debug.V8DebugServer.access$800(r4)     // Catch: java.lang.Throwable -> L8a
                java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> L8a
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L8a
                r3 = -1
                r7 = r1
                r5 = 0
                r6 = 0
                r8 = -1
            L1e:
                int r9 = 4096 - r5
                int r9 = r4.read(r2, r5, r9)
                if (r9 <= 0) goto L89
                int r9 = r9 + r5
                r11.from = r0
            L29:
                if (r8 >= 0) goto L32
                int r8 = r11.readContentLength(r2, r9)
                if (r8 >= 0) goto L32
                goto L79
            L32:
                if (r6 != 0) goto L3b
                boolean r6 = r11.skipToolInfo(r2, r9)
                if (r6 != 0) goto L3b
                goto L79
            L3b:
                int r5 = r7.length
                int r5 = r8 - r5
                int r10 = r11.from
                int r10 = r9 - r10
                int r5 = java.lang.Math.min(r5, r10)
                int r10 = r11.from
                byte[] r7 = r11.join(r7, r2, r10, r5)
                int r10 = r11.from
                int r10 = r10 + r5
                r11.from = r10
                int r5 = r7.length
                if (r5 != r8) goto L75
                java.lang.String r5 = new java.lang.String
                java.nio.charset.Charset r6 = com.eclipsesource.p043v8.debug.V8DebugServer.access$1100()
                r5.<init>(r7, r6)
                com.eclipsesource.v8.debug.V8DebugServer r6 = r11.this$0
                java.util.List r10 = com.eclipsesource.p043v8.debug.V8DebugServer.access$1200(r6)
                monitor-enter(r10)
                com.eclipsesource.v8.debug.V8DebugServer r6 = r11.this$0     // Catch: java.lang.Throwable -> L72
                java.util.List r6 = com.eclipsesource.p043v8.debug.V8DebugServer.access$1200(r6)     // Catch: java.lang.Throwable -> L72
                r6.add(r5)     // Catch: java.lang.Throwable -> L72
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L72
                r7 = r1
                r6 = 0
                r8 = -1
                goto L75
            L72:
                r0 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L72
                throw r0
            L75:
                int r5 = r11.from
                if (r5 < r9) goto L29
            L79:
                int r5 = r11.from
                if (r5 >= r9) goto L87
                int r10 = r9 - r5
                java.lang.System.arraycopy(r2, r5, r2, r0, r10)
                int r5 = r11.from
                int r5 = r9 - r5
                goto L1e
            L87:
                r5 = 0
                goto L1e
            L89:
                return
            L8a:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L8a
                throw r0
        }

        private int readContentLength(byte[] r5, int r6) {
                r4 = this;
                byte[] r0 = com.eclipsesource.p043v8.debug.V8DebugServer.access$1300()
                int r1 = r4.from
                int r0 = r4.indexOf(r0, r5, r1, r6)
                r1 = -1
                if (r0 >= 0) goto Le
                return r1
            Le:
                byte[] r2 = com.eclipsesource.p043v8.debug.V8DebugServer.access$1300()
                int r2 = r2.length
                int r0 = r0 + r2
                byte[] r2 = com.eclipsesource.p043v8.debug.V8DebugServer.access$1400()
                int r6 = r4.indexOf(r2, r5, r0, r6)
                if (r6 >= 0) goto L1f
                return r1
            L1f:
                java.lang.String r1 = new java.lang.String
                int r2 = r6 - r0
                java.nio.charset.Charset r3 = com.eclipsesource.p043v8.debug.V8DebugServer.access$1100()
                r1.<init>(r5, r0, r2, r3)
                java.lang.String r0 = r1.trim()     // Catch: java.lang.Exception -> L3b
                int r5 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L3b
                byte[] r0 = com.eclipsesource.p043v8.debug.V8DebugServer.access$1400()
                int r0 = r0.length
                int r6 = r6 + r0
                r4.from = r6
                return r5
            L3b:
                java.io.IOException r6 = new java.io.IOException
                java.lang.String r0 = "Invalid content length header: '"
                java.lang.String r2 = "' in message"
                java.lang.StringBuilder r0 = androidx.activity.result.C0196d.m449a(r0, r1, r2)
                java.lang.String r1 = new java.lang.String
                java.nio.charset.Charset r2 = com.eclipsesource.p043v8.debug.V8DebugServer.access$1100()
                r1.<init>(r5, r2)
                r0.append(r1)
                java.lang.String r5 = r0.toString()
                r6.<init>(r5)
                throw r6
        }

        private boolean skipToolInfo(byte[] r3, int r4) {
                r2 = this;
                byte[] r0 = com.eclipsesource.p043v8.debug.V8DebugServer.access$1400()
                int r1 = r2.from
                int r3 = r2.indexOf(r0, r3, r1, r4)
                if (r3 >= 0) goto Le
                r3 = 0
                return r3
            Le:
                byte[] r4 = com.eclipsesource.p043v8.debug.V8DebugServer.access$1400()
                int r4 = r4.length
                int r3 = r3 + r4
                r2.from = r3
                r3 = 1
                return r3
        }

        private void startHandshake() {
                r3 = this;
                com.eclipsesource.v8.debug.V8DebugServer r0 = r3.this$0
                java.lang.String r1 = "V8-Version: 4.10.253\r\nProtocol-Version: 1\r\nEmbedding-Host: j2v8 4.0.0\r\nType: connect\r\n"
                java.lang.String r2 = ""
                com.eclipsesource.p043v8.debug.V8DebugServer.access$1000(r0, r1, r2)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
            L0:
                com.eclipsesource.v8.debug.V8DebugServer r0 = r4.this$0     // Catch: java.lang.Exception -> L34
                java.net.ServerSocket r0 = com.eclipsesource.p043v8.debug.V8DebugServer.access$600(r0)     // Catch: java.lang.Exception -> L34
                java.net.Socket r0 = r0.accept()     // Catch: java.lang.Exception -> L34
                r1 = 1
                r0.setTcpNoDelay(r1)     // Catch: java.lang.Exception -> L34
                com.eclipsesource.v8.debug.V8DebugServer r1 = r4.this$0     // Catch: java.lang.Exception -> L34
                java.lang.Object r1 = com.eclipsesource.p043v8.debug.V8DebugServer.access$700(r1)     // Catch: java.lang.Exception -> L34
                monitor-enter(r1)     // Catch: java.lang.Exception -> L34
                com.eclipsesource.v8.debug.V8DebugServer r2 = r4.this$0     // Catch: java.lang.Throwable -> L31
                com.eclipsesource.p043v8.debug.V8DebugServer.access$802(r2, r0)     // Catch: java.lang.Throwable -> L31
                com.eclipsesource.v8.debug.V8DebugServer r0 = r4.this$0     // Catch: java.lang.Throwable -> L31
                r2 = 0
                com.eclipsesource.p043v8.debug.V8DebugServer.access$902(r0, r2)     // Catch: java.lang.Throwable -> L31
                com.eclipsesource.v8.debug.V8DebugServer r0 = r4.this$0     // Catch: java.lang.Throwable -> L31
                java.lang.Object r0 = com.eclipsesource.p043v8.debug.V8DebugServer.access$700(r0)     // Catch: java.lang.Throwable -> L31
                r0.notifyAll()     // Catch: java.lang.Throwable -> L31
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
                r4.startHandshake()     // Catch: java.lang.Exception -> L34
                r4.processClientRequests()     // Catch: java.lang.Exception -> L34
                goto L0
            L31:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
                throw r0     // Catch: java.lang.Exception -> L34
            L34:
                r0 = move-exception
                com.eclipsesource.v8.debug.V8DebugServer r1 = r4.this$0
                java.lang.Object r1 = com.eclipsesource.p043v8.debug.V8DebugServer.access$700(r1)
                monitor-enter(r1)
                com.eclipsesource.v8.debug.V8DebugServer r2 = r4.this$0     // Catch: java.lang.Throwable -> L5a
                java.net.Socket r2 = com.eclipsesource.p043v8.debug.V8DebugServer.access$800(r2)     // Catch: java.lang.Throwable -> L5a
                if (r2 == 0) goto L53
                com.eclipsesource.v8.debug.V8DebugServer r2 = r4.this$0     // Catch: java.io.IOException -> L4d java.lang.Throwable -> L5a
                java.net.Socket r2 = com.eclipsesource.p043v8.debug.V8DebugServer.access$800(r2)     // Catch: java.io.IOException -> L4d java.lang.Throwable -> L5a
                r2.close()     // Catch: java.io.IOException -> L4d java.lang.Throwable -> L5a
            L4d:
                com.eclipsesource.v8.debug.V8DebugServer r2 = r4.this$0     // Catch: java.lang.Throwable -> L5a
                r3 = 0
                com.eclipsesource.p043v8.debug.V8DebugServer.access$802(r2, r3)     // Catch: java.lang.Throwable -> L5a
            L53:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L5a
                com.eclipsesource.v8.debug.V8DebugServer r1 = r4.this$0
                r1.logError(r0)
                goto L0
            L5a:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L5a
                throw r0
        }
    }

    public class EventHandler implements com.eclipsesource.p043v8.JavaVoidCallback {
        public final /* synthetic */ com.eclipsesource.p043v8.debug.V8DebugServer this$0;

        private EventHandler(com.eclipsesource.p043v8.debug.V8DebugServer r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ EventHandler(com.eclipsesource.p043v8.debug.V8DebugServer r1, com.eclipsesource.p043v8.debug.V8DebugServer.C10341 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void safeRelease(com.eclipsesource.p043v8.Releasable r1) {
                r0 = this;
                if (r1 == 0) goto L5
                r1.release()
            L5:
                return
        }

        @Override // com.eclipsesource.p043v8.JavaVoidCallback
        public void invoke(com.eclipsesource.p043v8.V8Object r7, com.eclipsesource.p043v8.V8Array r8) {
                r6 = this;
                if (r8 == 0) goto La0
                boolean r7 = r8.isUndefined()
                if (r7 == 0) goto La
                goto La0
            La:
                r7 = 0
                r0 = 0
                int r7 = r8.getInteger(r7)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8a
                r1 = 1
                com.eclipsesource.v8.V8Object r2 = r8.getObject(r1)     // Catch: java.lang.Throwable -> L87 java.lang.Exception -> L8a
                r3 = 2
                com.eclipsesource.v8.V8Object r0 = r8.getObject(r3)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83
                com.eclipsesource.v8.debug.V8DebugServer r8 = r6.this$0     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83
                boolean r8 = com.eclipsesource.p043v8.debug.V8DebugServer.access$200(r8)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83
                if (r8 == 0) goto L55
                java.lang.String r8 = "unknown"
                switch(r7) {
                    case 1: goto L3d;
                    case 2: goto L3a;
                    case 3: goto L37;
                    case 4: goto L34;
                    case 5: goto L31;
                    case 6: goto L2e;
                    case 7: goto L2b;
                    case 8: goto L28;
                    default: goto L27;
                }     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83
            L27:
                goto L3f
            L28:
                java.lang.String r8 = "AsyncTaskEvent"
                goto L3f
            L2b:
                java.lang.String r8 = "PromiseEvent"
                goto L3f
            L2e:
                java.lang.String r8 = "CompileError"
                goto L3f
            L31:
                java.lang.String r8 = "AfterCompile"
                goto L3f
            L34:
                java.lang.String r8 = "BeforeCompile"
                goto L3f
            L37:
                java.lang.String r8 = "NewFunction"
                goto L3f
            L3a:
                java.lang.String r8 = "Exception"
                goto L3f
            L3d:
                java.lang.String r8 = "Break"
            L3f:
                java.io.PrintStream r3 = java.lang.System.out     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83
                r4.<init>()     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83
                java.lang.String r5 = "V8 has emmitted an event of type "
                r4.append(r5)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83
                r4.append(r8)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83
                java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83
                r3.println(r8)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83
            L55:
                com.eclipsesource.v8.debug.V8DebugServer r8 = r6.this$0     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83
                boolean r8 = com.eclipsesource.p043v8.debug.V8DebugServer.access$300(r8)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83
                if (r8 != 0) goto L64
                r6.safeRelease(r2)
                r6.safeRelease(r0)
                return
            L64:
                if (r7 == r1) goto L73
                r8 = 5
                if (r7 == r8) goto L6d
                r8 = 6
                if (r7 == r8) goto L6d
                goto L78
            L6d:
                com.eclipsesource.v8.debug.V8DebugServer r7 = r6.this$0     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83
                com.eclipsesource.p043v8.debug.V8DebugServer.access$500(r7, r0)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83
                goto L78
            L73:
                com.eclipsesource.v8.debug.V8DebugServer r7 = r6.this$0     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83
                com.eclipsesource.p043v8.debug.V8DebugServer.access$400(r7, r2, r0)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L83
            L78:
                r6.safeRelease(r2)
                r6.safeRelease(r0)
                goto L97
            L7f:
                r7 = move-exception
                r8 = r0
                r0 = r2
                goto L99
            L83:
                r7 = move-exception
                r8 = r0
                r0 = r2
                goto L8c
            L87:
                r7 = move-exception
                r8 = r0
                goto L99
            L8a:
                r7 = move-exception
                r8 = r0
            L8c:
                com.eclipsesource.v8.debug.V8DebugServer r1 = r6.this$0     // Catch: java.lang.Throwable -> L98
                r1.logError(r7)     // Catch: java.lang.Throwable -> L98
                r6.safeRelease(r0)
                r6.safeRelease(r8)
            L97:
                return
            L98:
                r7 = move-exception
            L99:
                r6.safeRelease(r0)
                r6.safeRelease(r8)
                throw r7
            La0:
                return
        }
    }

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.eclipsesource.p043v8.debug.V8DebugServer.PROTOCOL_CHARSET = r0
            java.lang.String r1 = "\r\n"
            byte[] r1 = r1.getBytes(r0)
            com.eclipsesource.p043v8.debug.V8DebugServer.PROTOCOL_EOL_BYTES = r1
            java.lang.String r1 = "Content-Length:"
            byte[] r0 = r1.getBytes(r0)
            com.eclipsesource.p043v8.debug.V8DebugServer.PROTOCOL_CONTENT_LENGTH_BYTES = r0
            return
    }

    public V8DebugServer(com.eclipsesource.p043v8.C1032V8 r5, int r6, boolean r7) {
            r4 = this;
            r4.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.clientLock = r0
            r0 = 0
            r4.traceCommunication = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r4.requests = r0
            r4.runtime = r5
            r4.waitForConnection = r7
            java.lang.String r7 = com.eclipsesource.p043v8.debug.V8DebugServer.DEBUG_OBJECT_NAME
            com.eclipsesource.v8.V8Object r7 = r5.getObject(r7)
            if (r7 != 0) goto L28
            java.io.PrintStream r5 = java.lang.System.err
            java.lang.String r6 = "Cannot initialize debugger server - global debug object not found."
            r5.println(r6)
            return
        L28:
            java.lang.String r0 = "Debug"
            com.eclipsesource.v8.V8Object r0 = r7.getObject(r0)     // Catch: java.lang.Throwable -> L83
            r4.debugObject = r0     // Catch: java.lang.Throwable -> L83
            r7.close()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "(function() {\n "
            r7.append(r0)
            java.lang.String r0 = com.eclipsesource.p043v8.debug.V8DebugServer.DEBUG_OBJECT_NAME
            java.lang.String r1 = ".Debug. "
            java.lang.String r2 = "__j2v8_MakeBreakEvent"
            java.lang.String r3 = " = function (break_id,breakpoints_hit) {\n  return new "
            p179k1.C3661s.m8090a(r7, r0, r1, r2, r3)
            java.lang.String r0 = com.eclipsesource.p043v8.debug.V8DebugServer.DEBUG_OBJECT_NAME
            r7.append(r0)
            java.lang.String r0 = ".BreakEvent(break_id,breakpoints_hit);\n }\n "
            r7.append(r0)
            java.lang.String r0 = com.eclipsesource.p043v8.debug.V8DebugServer.DEBUG_OBJECT_NAME
            java.lang.String r2 = "__j2v8_MakeCompileEvent"
            java.lang.String r3 = " = function(script,type) {\n  var scripts = "
            p179k1.C3661s.m8090a(r7, r0, r1, r2, r3)
            java.lang.String r0 = com.eclipsesource.p043v8.debug.V8DebugServer.DEBUG_OBJECT_NAME
            r7.append(r0)
            java.lang.String r0 = ".Debug.scripts()\n  for (var i in scripts) {\n   if (scripts[i].id == script.id()) {\n     return new "
            r7.append(r0)
            java.lang.String r0 = com.eclipsesource.p043v8.debug.V8DebugServer.DEBUG_OBJECT_NAME
            r7.append(r0)
            java.lang.String r0 = ".CompileEvent(scripts[i], type);\n   }\n  }\n  return {toJSONProtocol: function() {return ''}}\n }\n})()"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r5.executeVoidScript(r7)
            java.net.ServerSocket r5 = new java.net.ServerSocket     // Catch: java.lang.Exception -> L7e
            r5.<init>(r6)     // Catch: java.lang.Exception -> L7e
            r4.server = r5     // Catch: java.lang.Exception -> L7e
            goto L82
        L7e:
            r5 = move-exception
            r4.logError(r5)
        L82:
            return
        L83:
            r5 = move-exception
            r7.close()
            throw r5
    }

    public static /* synthetic */ void access$1000(com.eclipsesource.p043v8.debug.V8DebugServer r0, java.lang.String r1, java.lang.String r2) {
            r0.sendMessage(r1, r2)
            return
    }

    public static /* synthetic */ java.nio.charset.Charset access$1100() {
            java.nio.charset.Charset r0 = com.eclipsesource.p043v8.debug.V8DebugServer.PROTOCOL_CHARSET
            return r0
    }

    public static /* synthetic */ java.util.List access$1200(com.eclipsesource.p043v8.debug.V8DebugServer r0) {
            java.util.List<java.lang.String> r0 = r0.requests
            return r0
    }

    public static /* synthetic */ byte[] access$1300() {
            byte[] r0 = com.eclipsesource.p043v8.debug.V8DebugServer.PROTOCOL_CONTENT_LENGTH_BYTES
            return r0
    }

    public static /* synthetic */ byte[] access$1400() {
            byte[] r0 = com.eclipsesource.p043v8.debug.V8DebugServer.PROTOCOL_EOL_BYTES
            return r0
    }

    public static /* synthetic */ boolean access$200(com.eclipsesource.p043v8.debug.V8DebugServer r0) {
            boolean r0 = r0.traceCommunication
            return r0
    }

    public static /* synthetic */ boolean access$300(com.eclipsesource.p043v8.debug.V8DebugServer r0) {
            boolean r0 = r0.isConnected()
            return r0
    }

    public static /* synthetic */ void access$400(com.eclipsesource.p043v8.debug.V8DebugServer r0, com.eclipsesource.p043v8.V8Object r1, com.eclipsesource.p043v8.V8Object r2) {
            r0.enterBreakLoop(r1, r2)
            return
    }

    public static /* synthetic */ void access$500(com.eclipsesource.p043v8.debug.V8DebugServer r0, com.eclipsesource.p043v8.V8Object r1) {
            r0.sendCompileEvent(r1)
            return
    }

    public static /* synthetic */ java.net.ServerSocket access$600(com.eclipsesource.p043v8.debug.V8DebugServer r0) {
            java.net.ServerSocket r0 = r0.server
            return r0
    }

    public static /* synthetic */ java.lang.Object access$700(com.eclipsesource.p043v8.debug.V8DebugServer r0) {
            java.lang.Object r0 = r0.clientLock
            return r0
    }

    public static /* synthetic */ java.net.Socket access$800(com.eclipsesource.p043v8.debug.V8DebugServer r0) {
            java.net.Socket r0 = r0.client
            return r0
    }

    public static /* synthetic */ java.net.Socket access$802(com.eclipsesource.p043v8.debug.V8DebugServer r0, java.net.Socket r1) {
            r0.client = r1
            return r1
    }

    public static /* synthetic */ boolean access$902(com.eclipsesource.p043v8.debug.V8DebugServer r0, boolean r1) {
            r0.waitForConnection = r1
            return r1
    }

    public static void configureV8ForDebugging() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = "-expose-debug-as="
            r0.append(r1)     // Catch: java.lang.Throwable -> L17
            java.lang.String r1 = com.eclipsesource.p043v8.debug.V8DebugServer.DEBUG_OBJECT_NAME     // Catch: java.lang.Throwable -> L17
            r0.append(r1)     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L17
            com.eclipsesource.p043v8.C1032V8.setFlags(r0)     // Catch: java.lang.Throwable -> L17
            goto L1b
        L17:
            r0 = move-exception
            r0.printStackTrace()
        L1b:
            return
    }

    private void enterBreakLoop(com.eclipsesource.p043v8.V8Object r7, com.eclipsesource.p043v8.V8Object r8) {
            r6 = this;
            r0 = 0
            com.eclipsesource.v8.V8Array r1 = new com.eclipsesource.v8.V8Array     // Catch: java.lang.Throwable -> L97
            com.eclipsesource.v8.V8 r2 = r6.runtime     // Catch: java.lang.Throwable -> L97
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L97
            r2 = 0
            r1.push(r2)     // Catch: java.lang.Throwable -> L92
            java.lang.String r2 = "debugCommandProcessor"
            com.eclipsesource.v8.V8Object r2 = r7.executeObjectFunction(r2, r1)     // Catch: java.lang.Throwable -> L92
            r6.stoppedStateDcp = r2     // Catch: java.lang.Throwable -> L92
            r1.close()     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "break_id"
            int r7 = r7.getInteger(r1)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "break_points_hit_"
            com.eclipsesource.v8.V8Array r8 = r8.getArray(r1)     // Catch: java.lang.Throwable -> L97
            com.eclipsesource.v8.V8Array r1 = new com.eclipsesource.v8.V8Array     // Catch: java.lang.Throwable -> L97
            com.eclipsesource.v8.V8 r2 = r6.runtime     // Catch: java.lang.Throwable -> L97
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L97
            r1.push(r7)     // Catch: java.lang.Throwable -> L84
            r1.push(r8)     // Catch: java.lang.Throwable -> L84
            com.eclipsesource.v8.V8Object r7 = r6.debugObject     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = "__j2v8_MakeBreakEvent"
            com.eclipsesource.v8.V8Object r7 = r7.executeObjectFunction(r2, r1)     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = "toJSONProtocol"
            java.lang.String r2 = r7.executeStringFunction(r2, r0)     // Catch: java.lang.Throwable -> L82
            boolean r3 = r6.traceCommunication     // Catch: java.lang.Throwable -> L82
            if (r3 == 0) goto L58
            java.io.PrintStream r3 = java.lang.System.out     // Catch: java.lang.Throwable -> L82
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82
            r4.<init>()     // Catch: java.lang.Throwable -> L82
            java.lang.String r5 = "Sending event (Break):\n"
            r4.append(r5)     // Catch: java.lang.Throwable -> L82
            r4.append(r2)     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L82
            r3.println(r4)     // Catch: java.lang.Throwable -> L82
        L58:
            r6.sendJson(r2)     // Catch: java.lang.Throwable -> L82
            r1.close()     // Catch: java.lang.Throwable -> L97
            r8.close()     // Catch: java.lang.Throwable -> L97
            r7.close()     // Catch: java.lang.Throwable -> L97
        L64:
            boolean r7 = r6.isConnected()     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L7a
            com.eclipsesource.v8.V8Object r7 = r6.stoppedStateDcp     // Catch: java.lang.Throwable -> L97
            java.lang.String r8 = "isRunning"
            boolean r7 = r7.executeBooleanFunction(r8, r0)     // Catch: java.lang.Throwable -> L97
            if (r7 != 0) goto L7a
            r7 = 10
            r6.processRequests(r7)     // Catch: java.lang.InterruptedException -> L64 java.lang.Throwable -> L97
            goto L64
        L7a:
            com.eclipsesource.v8.V8Object r7 = r6.stoppedStateDcp
            r7.close()
            r6.stoppedStateDcp = r0
            return
        L82:
            r2 = move-exception
            goto L86
        L84:
            r2 = move-exception
            r7 = r0
        L86:
            r1.close()     // Catch: java.lang.Throwable -> L97
            r8.close()     // Catch: java.lang.Throwable -> L97
            if (r7 == 0) goto L91
            r7.close()     // Catch: java.lang.Throwable -> L97
        L91:
            throw r2     // Catch: java.lang.Throwable -> L97
        L92:
            r7 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L97
            throw r7     // Catch: java.lang.Throwable -> L97
        L97:
            r7 = move-exception
            com.eclipsesource.v8.V8Object r8 = r6.stoppedStateDcp
            r8.close()
            r6.stoppedStateDcp = r0
            throw r7
    }

    private boolean isConnected() {
            r2 = this;
            java.lang.Object r0 = r2.clientLock
            monitor-enter(r0)
            java.net.ServerSocket r1 = r2.server     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L13
            java.net.Socket r1 = r2.client     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L13
            boolean r1 = r1.isConnected()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return r1
        L16:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    private void processRequest(java.lang.String r6) {
            r5 = this;
            boolean r0 = r5.traceCommunication
            r1 = 1000(0x3e8, float:1.401E-42)
            r2 = 0
            if (r0 == 0) goto L25
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r3 = "Got message: \n"
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
            int r4 = r6.length()
            int r4 = java.lang.Math.min(r4, r1)
            java.lang.String r4 = r6.substring(r2, r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.println(r3)
        L25:
            com.eclipsesource.v8.V8Array r0 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8 r3 = r5.runtime
            r0.<init>(r3)
            r0.push(r6)
            com.eclipsesource.v8.V8Object r6 = r5.stoppedStateDcp
            if (r6 == 0) goto L34
            goto L36
        L34:
            com.eclipsesource.v8.V8Object r6 = r5.runningStateDcp
        L36:
            java.lang.String r3 = "processDebugJSONRequest"
            java.lang.Object r0 = r6.executeFunction(r3, r0)
            java.lang.String r0 = r0.toString()
            com.eclipsesource.v8.V8Object r3 = r5.stoppedStateDcp
            if (r3 != 0) goto L68
            java.lang.String r3 = "\"running\":false"
            boolean r4 = r0.contains(r3)
            if (r4 == 0) goto L68
            java.lang.String r4 = "\"running\":true"
            java.lang.String r0 = r0.replace(r3, r4)
            java.lang.String r3 = "\"success\":true"
            java.lang.String r4 = "\"success\":false"
            java.lang.String r0 = r0.replace(r3, r4)
            java.lang.String r3 = "{\""
            java.lang.String r4 = "{\"message\":\"Client requested suspension is not supported on J2V8.\",\""
            java.lang.String r0 = r0.replace(r3, r4)
            r3 = 1
            java.lang.String r4 = "running_"
            r6.add(r4, r3)
        L68:
            boolean r6 = r5.traceCommunication
            if (r6 == 0) goto L8a
            java.io.PrintStream r6 = java.lang.System.out
            java.lang.String r3 = "Returning response: \n"
            java.lang.StringBuilder r3 = android.support.v4.media.C0144c.m256a(r3)
            int r4 = r0.length()
            int r1 = java.lang.Math.min(r4, r1)
            java.lang.String r1 = r0.substring(r2, r1)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r6.println(r1)
        L8a:
            r5.sendJson(r0)
            return
    }

    private void sendCompileEvent(com.eclipsesource.p043v8.V8Object r10) {
            r9 = this;
            boolean r0 = r9.isConnected()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "type_"
            int r0 = r10.getInteger(r0)
            java.lang.String r1 = "script_"
            com.eclipsesource.v8.V8Object r10 = r10.getObject(r1)
            com.eclipsesource.v8.V8Array r1 = new com.eclipsesource.v8.V8Array
            com.eclipsesource.v8.V8 r2 = r9.runtime
            r1.<init>(r2)
            r2 = 0
            r1.push(r10)     // Catch: java.lang.Throwable -> L6d
            r1.push(r0)     // Catch: java.lang.Throwable -> L6d
            com.eclipsesource.v8.V8Object r0 = r9.debugObject     // Catch: java.lang.Throwable -> L6d
            java.lang.String r3 = "__j2v8_MakeCompileEvent"
            com.eclipsesource.v8.V8Object r0 = r0.executeObjectFunction(r3, r1)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r3 = "toJSONProtocol"
            java.lang.String r2 = r0.executeStringFunction(r3, r2)     // Catch: java.lang.Throwable -> L6b
            boolean r3 = r9.traceCommunication     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L58
            java.io.PrintStream r3 = java.lang.System.out     // Catch: java.lang.Throwable -> L6b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
            r4.<init>()     // Catch: java.lang.Throwable -> L6b
            java.lang.String r5 = "Sending event (CompileEvent):\n"
            r4.append(r5)     // Catch: java.lang.Throwable -> L6b
            r5 = 0
            int r6 = r2.length()     // Catch: java.lang.Throwable -> L6b
            r7 = 1000(0x3e8, float:1.401E-42)
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r5 = r2.substring(r5, r6)     // Catch: java.lang.Throwable -> L6b
            r4.append(r5)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L6b
            r3.println(r4)     // Catch: java.lang.Throwable -> L6b
        L58:
            int r3 = r2.length()     // Catch: java.lang.Throwable -> L6b
            if (r3 <= 0) goto L61
            r9.sendJson(r2)     // Catch: java.lang.Throwable -> L6b
        L61:
            r1.close()
            r10.close()
            r0.close()
            return
        L6b:
            r2 = move-exception
            goto L71
        L6d:
            r0 = move-exception
            r8 = r2
            r2 = r0
            r0 = r8
        L71:
            r1.close()
            r10.close()
            if (r0 == 0) goto L7c
            r0.close()
        L7c:
            throw r2
    }

    private void sendJson(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "\\/"
            java.lang.String r1 = "/"
            java.lang.String r3 = r3.replace(r0, r1)
            java.lang.String r0 = ""
            r2.sendMessage(r0, r3)
            return
    }

    private void sendMessage(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            java.lang.Object r0 = r3.clientLock
            monitor-enter(r0)
            boolean r1 = r3.isConnected()     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L4d
            java.nio.charset.Charset r1 = com.eclipsesource.p043v8.debug.V8DebugServer.PROTOCOL_CHARSET     // Catch: java.lang.Throwable -> L55
            byte[] r5 = r5.getBytes(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r2.<init>()     // Catch: java.lang.Throwable -> L55
            r2.append(r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = "Content-Length:"
            r2.append(r4)     // Catch: java.lang.Throwable -> L55
            int r4 = r5.length     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch: java.lang.Throwable -> L55
            r2.append(r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = "\r\n"
            r2.append(r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = "\r\n"
            r2.append(r4)     // Catch: java.lang.Throwable -> L55
            java.net.Socket r4 = r3.client     // Catch: java.lang.Throwable -> L55
            java.io.OutputStream r4 = r4.getOutputStream()     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L55
            byte[] r1 = r2.getBytes(r1)     // Catch: java.lang.Throwable -> L55
            r4.write(r1)     // Catch: java.lang.Throwable -> L55
            int r4 = r5.length     // Catch: java.lang.Throwable -> L55
            if (r4 <= 0) goto L4b
            java.net.Socket r4 = r3.client     // Catch: java.lang.Throwable -> L55
            java.io.OutputStream r4 = r4.getOutputStream()     // Catch: java.lang.Throwable -> L55
            r4.write(r5)     // Catch: java.lang.Throwable -> L55
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L55
            return
        L4d:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = "There is no connected client."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L55
            throw r4     // Catch: java.lang.Throwable -> L55
        L55:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L55
            throw r4
    }

    private void setupEventHandler() {
            r5 = this;
            com.eclipsesource.v8.debug.V8DebugServer$EventHandler r0 = new com.eclipsesource.v8.debug.V8DebugServer$EventHandler
            r1 = 0
            r0.<init>(r5, r1)
            com.eclipsesource.v8.V8Object r2 = r5.debugObject
            java.lang.String r3 = "__j2v8_debug_handler"
            r2.registerJavaMethod(r0, r3)
            com.eclipsesource.v8.V8Object r0 = r5.debugObject     // Catch: java.lang.Throwable -> L42
            com.eclipsesource.v8.V8Object r0 = r0.getObject(r3)     // Catch: java.lang.Throwable -> L42
            com.eclipsesource.v8.V8Function r0 = (com.eclipsesource.p043v8.V8Function) r0     // Catch: java.lang.Throwable -> L42
            com.eclipsesource.v8.V8Array r2 = new com.eclipsesource.v8.V8Array     // Catch: java.lang.Throwable -> L3d
            com.eclipsesource.v8.V8 r3 = r5.runtime     // Catch: java.lang.Throwable -> L3d
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L3d
            r2.push(r0)     // Catch: java.lang.Throwable -> L3b
            com.eclipsesource.v8.V8Object r1 = r5.debugObject     // Catch: java.lang.Throwable -> L3b
            java.lang.String r3 = "setListener"
            r1.executeFunction(r3, r2)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L31
            boolean r1 = r0.isReleased()
            if (r1 != 0) goto L31
            r0.close()
        L31:
            boolean r0 = r2.isReleased()
            if (r0 != 0) goto L3a
            r2.close()
        L3a:
            return
        L3b:
            r1 = move-exception
            goto L46
        L3d:
            r2 = move-exception
            r4 = r2
            r2 = r1
            r1 = r4
            goto L46
        L42:
            r0 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
        L46:
            if (r0 == 0) goto L51
            boolean r3 = r0.isReleased()
            if (r3 != 0) goto L51
            r0.close()
        L51:
            if (r2 == 0) goto L5c
            boolean r0 = r2.isReleased()
            if (r0 != 0) goto L5c
            r2.close()
        L5c:
            throw r1
    }

    public int getPort() {
            r1 = this;
            java.net.ServerSocket r0 = r1.server
            if (r0 == 0) goto L11
            boolean r0 = r0.isBound()
            if (r0 == 0) goto L11
            java.net.ServerSocket r0 = r1.server
            int r0 = r0.getLocalPort()
            goto L12
        L11:
            r0 = -1
        L12:
            return r0
    }

    public void logError(java.lang.Throwable r1) {
            r0 = this;
            r1.printStackTrace()
            return
    }

    public void processRequests(long r8) {
            r7 = this;
            java.net.ServerSocket r0 = r7.server
            if (r0 != 0) goto L5
            return
        L5:
            long r0 = java.lang.System.currentTimeMillis()
        L9:
            java.util.List<java.lang.String> r2 = r7.requests
            monitor-enter(r2)
            java.util.List<java.lang.String> r3 = r7.requests     // Catch: java.lang.Throwable -> L4c
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L4c
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L4c
            java.lang.Object[] r3 = r3.toArray(r4)     // Catch: java.lang.Throwable -> L4c
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch: java.lang.Throwable -> L4c
            java.util.List<java.lang.String> r4 = r7.requests     // Catch: java.lang.Throwable -> L4c
            r4.clear()     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4c
            int r2 = r3.length
            r4 = 0
        L22:
            if (r4 >= r2) goto L31
            r5 = r3[r4]
            r7.processRequest(r5)     // Catch: java.lang.Exception -> L2a
            goto L2e
        L2a:
            r5 = move-exception
            r7.logError(r5)
        L2e:
            int r4 = r4 + 1
            goto L22
        L31:
            int r2 = r3.length
            if (r2 > 0) goto L9
            r2 = 0
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 <= 0) goto L3f
            r2 = 10
            java.lang.Thread.sleep(r2)
        L3f:
            if (r4 <= 0) goto L4b
            long r2 = r0 + r8
            long r4 = java.lang.System.currentTimeMillis()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L9
        L4b:
            return
        L4c:
            r8 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4c
            throw r8
    }

    public void setTraceCommunication(boolean r1) {
            r0 = this;
            r0.traceCommunication = r1
            return
    }

    public void start() {
            r4 = this;
            java.net.ServerSocket r0 = r4.server
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r4.waitForConnection
            java.lang.Thread r1 = new java.lang.Thread
            com.eclipsesource.v8.debug.V8DebugServer$ClientLoop r2 = new com.eclipsesource.v8.debug.V8DebugServer$ClientLoop
            r3 = 0
            r2.<init>(r4, r3)
            java.lang.String r3 = "J2V8 Debugger Server"
            r1.<init>(r2, r3)
            r2 = 1
            r1.setDaemon(r2)
            r1.start()
            r4.setupEventHandler()
            com.eclipsesource.v8.V8 r1 = r4.runtime
            java.lang.String r2 = "(function() {return new "
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.String r3 = com.eclipsesource.p043v8.debug.V8DebugServer.DEBUG_OBJECT_NAME
            r2.append(r3)
            java.lang.String r3 = ".DebugCommandProcessor(null, true)})()"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.eclipsesource.v8.V8Object r1 = r1.executeObjectScript(r2)
            r4.runningStateDcp = r1
            if (r0 == 0) goto L53
            java.lang.Object r0 = r4.clientLock
            monitor-enter(r0)
        L3f:
            boolean r1 = r4.waitForConnection     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L49
            java.lang.Object r1 = r4.clientLock     // Catch: java.lang.InterruptedException -> L3f java.lang.Throwable -> L50
            r1.wait()     // Catch: java.lang.InterruptedException -> L3f java.lang.Throwable -> L50
            goto L3f
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            r0 = 100
            r4.processRequests(r0)     // Catch: java.lang.InterruptedException -> L53
            goto L53
        L50:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            throw r1
        L53:
            return
    }

    public void stop() {
            r3 = this;
            r0 = 0
            java.net.ServerSocket r1 = r3.server     // Catch: java.io.IOException -> L17
            r1.close()     // Catch: java.io.IOException -> L17
            java.lang.Object r1 = r3.clientLock     // Catch: java.io.IOException -> L17
            monitor-enter(r1)     // Catch: java.io.IOException -> L17
            java.net.Socket r2 = r3.client     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L12
            r2.close()     // Catch: java.lang.Throwable -> L14
            r3.client = r0     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            goto L1b
        L14:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r2     // Catch: java.io.IOException -> L17
        L17:
            r1 = move-exception
            r3.logError(r1)
        L1b:
            com.eclipsesource.v8.V8Object r1 = r3.runningStateDcp
            if (r1 == 0) goto L24
            r1.close()
            r3.runningStateDcp = r0
        L24:
            com.eclipsesource.v8.V8Object r1 = r3.debugObject
            if (r1 == 0) goto L2d
            r1.close()
            r3.debugObject = r0
        L2d:
            com.eclipsesource.v8.V8Object r1 = r3.stoppedStateDcp
            if (r1 == 0) goto L36
            r1.close()
            r3.stoppedStateDcp = r0
        L36:
            return
    }
}
