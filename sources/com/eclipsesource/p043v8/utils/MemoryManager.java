package com.eclipsesource.p043v8.utils;

/* loaded from: classes.dex */
public class MemoryManager {
    private com.eclipsesource.v8.utils.MemoryManager.MemoryManagerReferenceHandler memoryManagerReferenceHandler;
    private java.util.ArrayList<com.eclipsesource.p043v8.V8Value> references;
    private boolean released;
    private boolean releasing;

    /* renamed from: v8 */
    private com.eclipsesource.p043v8.C1032V8 f5228v8;

    /* renamed from: com.eclipsesource.v8.utils.MemoryManager$1 */
    public static /* synthetic */ class C10361 {
    }

    public class MemoryManagerReferenceHandler implements com.eclipsesource.p043v8.ReferenceHandler {
        public final /* synthetic */ com.eclipsesource.p043v8.utils.MemoryManager this$0;

        private MemoryManagerReferenceHandler(com.eclipsesource.p043v8.utils.MemoryManager r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ MemoryManagerReferenceHandler(com.eclipsesource.p043v8.utils.MemoryManager r1, com.eclipsesource.p043v8.utils.MemoryManager.C10361 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.eclipsesource.p043v8.ReferenceHandler
        public void v8HandleCreated(com.eclipsesource.p043v8.V8Value r2) {
                r1 = this;
                com.eclipsesource.v8.utils.MemoryManager r0 = r1.this$0
                java.util.ArrayList r0 = com.eclipsesource.p043v8.utils.MemoryManager.access$100(r0)
                r0.add(r2)
                return
        }

        @Override // com.eclipsesource.p043v8.ReferenceHandler
        public void v8HandleDisposed(com.eclipsesource.p043v8.V8Value r3) {
                r2 = this;
                com.eclipsesource.v8.utils.MemoryManager r0 = r2.this$0
                boolean r0 = com.eclipsesource.p043v8.utils.MemoryManager.access$200(r0)
                if (r0 != 0) goto L21
                com.eclipsesource.v8.utils.MemoryManager r0 = r2.this$0
                java.util.ArrayList r0 = com.eclipsesource.p043v8.utils.MemoryManager.access$100(r0)
                java.util.Iterator r0 = r0.iterator()
            L12:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L21
                java.lang.Object r1 = r0.next()
                if (r1 != r3) goto L12
                r0.remove()
            L21:
                return
        }
    }

    public MemoryManager(com.eclipsesource.p043v8.C1032V8 r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.references = r0
            r0 = 0
            r2.releasing = r0
            r2.released = r0
            r2.f5228v8 = r3
            com.eclipsesource.v8.utils.MemoryManager$MemoryManagerReferenceHandler r0 = new com.eclipsesource.v8.utils.MemoryManager$MemoryManagerReferenceHandler
            r1 = 0
            r0.<init>(r2, r1)
            r2.memoryManagerReferenceHandler = r0
            r3.addReferenceHandler(r0)
            return
    }

    public static /* synthetic */ java.util.ArrayList access$100(com.eclipsesource.p043v8.utils.MemoryManager r0) {
            java.util.ArrayList<com.eclipsesource.v8.V8Value> r0 = r0.references
            return r0
    }

    public static /* synthetic */ boolean access$200(com.eclipsesource.p043v8.utils.MemoryManager r0) {
            boolean r0 = r0.releasing
            return r0
    }

    private void checkReleased() {
            r2 = this;
            boolean r0 = r2.released
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Memory manager released"
            r0.<init>(r1)
            throw r0
    }

    public int getObjectReferenceCount() {
            r1 = this;
            r1.checkReleased()
            java.util.ArrayList<com.eclipsesource.v8.V8Value> r0 = r1.references
            int r0 = r0.size()
            return r0
    }

    public boolean isReleased() {
            r1 = this;
            boolean r0 = r1.released
            return r0
    }

    public void persist(com.eclipsesource.p043v8.V8Value r2) {
            r1 = this;
            com.eclipsesource.v8.V8 r0 = r1.f5228v8
            com.eclipsesource.v8.V8Locker r0 = r0.getLocker()
            r0.checkThread()
            r1.checkReleased()
            java.util.ArrayList<com.eclipsesource.v8.V8Value> r0 = r1.references
            r0.remove(r2)
            return
    }

    public void release() {
            r4 = this;
            com.eclipsesource.v8.V8 r0 = r4.f5228v8
            com.eclipsesource.v8.V8Locker r0 = r0.getLocker()
            r0.checkThread()
            boolean r0 = r4.released
            if (r0 == 0) goto Le
            return
        Le:
            r0 = 1
            r4.releasing = r0
            r1 = 0
            java.util.ArrayList<com.eclipsesource.v8.V8Value> r2 = r4.references     // Catch: java.lang.Throwable -> L39
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L39
        L18:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L28
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L39
            com.eclipsesource.v8.V8Value r3 = (com.eclipsesource.p043v8.V8Value) r3     // Catch: java.lang.Throwable -> L39
            r3.close()     // Catch: java.lang.Throwable -> L39
            goto L18
        L28:
            com.eclipsesource.v8.V8 r2 = r4.f5228v8     // Catch: java.lang.Throwable -> L39
            com.eclipsesource.v8.utils.MemoryManager$MemoryManagerReferenceHandler r3 = r4.memoryManagerReferenceHandler     // Catch: java.lang.Throwable -> L39
            r2.removeReferenceHandler(r3)     // Catch: java.lang.Throwable -> L39
            java.util.ArrayList<com.eclipsesource.v8.V8Value> r2 = r4.references     // Catch: java.lang.Throwable -> L39
            r2.clear()     // Catch: java.lang.Throwable -> L39
            r4.releasing = r1
            r4.released = r0
            return
        L39:
            r0 = move-exception
            r4.releasing = r1
            throw r0
    }
}
