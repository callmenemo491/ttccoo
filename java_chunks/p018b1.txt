package p018b1;

/* renamed from: b1.a */
/* loaded from: classes.dex */
public final class C0654a {

    /* renamed from: e */
    public static final java.lang.Object f3799e = null;

    /* renamed from: f */
    public static p018b1.C0654a f3800f;

    /* renamed from: a */
    public final android.content.Context f3801a;

    /* renamed from: b */
    public final java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<p018b1.C0654a.c>> f3802b;

    /* renamed from: c */
    public final java.util.HashMap<java.lang.String, java.util.ArrayList<p018b1.C0654a.c>> f3803c;

    /* renamed from: d */
    public final java.util.ArrayList<p018b1.C0654a.b> f3804d;

    /* renamed from: b1.a$a */
    public class a extends android.os.Handler {

        /* renamed from: a */
        public final /* synthetic */ p018b1.C0654a f3805a;

        public a(p018b1.C0654a r1, android.os.Looper r2) {
                r0 = this;
                r0.f3805a = r1
                r0.<init>(r2)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r5) {
                r4 = this;
                int r0 = r5.what
                r1 = 1
                if (r0 == r1) goto L9
                super.handleMessage(r5)
                goto L17
            L9:
                b1.a r5 = r4.f3805a
            Lb:
                java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<b1.a$c>> r0 = r5.f3802b
                monitor-enter(r0)
                java.util.ArrayList<b1.a$b> r1 = r5.f3804d     // Catch: java.lang.Throwable -> L2d
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L2d
                if (r1 > 0) goto L18
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
            L17:
                return
            L18:
                b1.a$b[] r2 = new p018b1.C0654a.b[r1]     // Catch: java.lang.Throwable -> L2d
                java.util.ArrayList<b1.a$b> r3 = r5.f3804d     // Catch: java.lang.Throwable -> L2d
                r3.toArray(r2)     // Catch: java.lang.Throwable -> L2d
                java.util.ArrayList<b1.a$b> r3 = r5.f3804d     // Catch: java.lang.Throwable -> L2d
                r3.clear()     // Catch: java.lang.Throwable -> L2d
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
                r0 = 0
                if (r1 > 0) goto L29
                goto Lb
            L29:
                r5 = r2[r0]
                r5 = 0
                throw r5
            L2d:
                r5 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
                throw r5
        }
    }

    /* renamed from: b1.a$b */
    public static final class b {
    }

    /* renamed from: b1.a$c */
    public static final class c {
        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 128(0x80, float:1.8E-43)
                r0.<init>(r1)
                java.lang.String r1 = "Receiver{"
                r0.append(r1)
                r1 = 0
                r0.append(r1)
                java.lang.String r2 = " filter="
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p018b1.C0654a.f3799e = r0
            return
    }

    public C0654a(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f3802b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f3803c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3804d = r0
            r1.f3801a = r2
            b1.a$a r0 = new b1.a$a
            android.os.Looper r2 = r2.getMainLooper()
            r0.<init>(r1, r2)
            return
    }

    /* renamed from: a */
    public static p018b1.C0654a m2198a(android.content.Context r2) {
            java.lang.Object r0 = p018b1.C0654a.f3799e
            monitor-enter(r0)
            b1.a r1 = p018b1.C0654a.f3800f     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L12
            b1.a r1 = new b1.a     // Catch: java.lang.Throwable -> L16
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L16
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L16
            p018b1.C0654a.f3800f = r1     // Catch: java.lang.Throwable -> L16
        L12:
            b1.a r2 = p018b1.C0654a.f3800f     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return r2
        L16:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r2
    }

    /* renamed from: b */
    public boolean m2199b(android.content.Intent r9) {
            r8 = this;
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<b1.a$c>> r0 = r8.f3802b
            monitor-enter(r0)
            r9.getAction()     // Catch: java.lang.Throwable -> L93
            android.content.Context r1 = r8.f3801a     // Catch: java.lang.Throwable -> L93
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = r9.resolveTypeIfNeeded(r1)     // Catch: java.lang.Throwable -> L93
            r9.getData()     // Catch: java.lang.Throwable -> L93
            java.lang.String r2 = r9.getScheme()     // Catch: java.lang.Throwable -> L93
            r9.getCategories()     // Catch: java.lang.Throwable -> L93
            int r3 = r9.getFlags()     // Catch: java.lang.Throwable -> L93
            r3 = r3 & 8
            r4 = 0
            if (r3 == 0) goto L25
            r3 = 1
            goto L26
        L25:
            r3 = 0
        L26:
            if (r3 == 0) goto L4e
            java.lang.String r5 = "LocalBroadcastManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            r6.<init>()     // Catch: java.lang.Throwable -> L93
            java.lang.String r7 = "Resolving type "
            r6.append(r7)     // Catch: java.lang.Throwable -> L93
            r6.append(r1)     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = " scheme "
            r6.append(r1)     // Catch: java.lang.Throwable -> L93
            r6.append(r2)     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = " of intent "
            r6.append(r1)     // Catch: java.lang.Throwable -> L93
            r6.append(r9)     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L93
            android.util.Log.v(r5, r1)     // Catch: java.lang.Throwable -> L93
        L4e:
            java.util.HashMap<java.lang.String, java.util.ArrayList<b1.a$c>> r1 = r8.f3803c     // Catch: java.lang.Throwable -> L93
            java.lang.String r9 = r9.getAction()     // Catch: java.lang.Throwable -> L93
            java.lang.Object r9 = r1.get(r9)     // Catch: java.lang.Throwable -> L93
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch: java.lang.Throwable -> L93
            if (r9 == 0) goto L91
            if (r3 == 0) goto L74
            java.lang.String r1 = "LocalBroadcastManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            r2.<init>()     // Catch: java.lang.Throwable -> L93
            java.lang.String r5 = "Action list: "
            r2.append(r5)     // Catch: java.lang.Throwable -> L93
            r2.append(r9)     // Catch: java.lang.Throwable -> L93
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L93
            android.util.Log.v(r1, r2)     // Catch: java.lang.Throwable -> L93
        L74:
            int r1 = r9.size()     // Catch: java.lang.Throwable -> L93
            if (r1 <= 0) goto L91
            java.lang.Object r9 = r9.get(r4)     // Catch: java.lang.Throwable -> L93
            b1.a$c r9 = (p018b1.C0654a.c) r9     // Catch: java.lang.Throwable -> L93
            if (r3 == 0) goto L8c
            java.lang.String r1 = "LocalBroadcastManager"
            java.util.Objects.requireNonNull(r9)     // Catch: java.lang.Throwable -> L93
            java.lang.String r2 = "Matching against filter null"
            android.util.Log.v(r1, r2)     // Catch: java.lang.Throwable -> L93
        L8c:
            java.util.Objects.requireNonNull(r9)     // Catch: java.lang.Throwable -> L93
            r9 = 0
            throw r9     // Catch: java.lang.Throwable -> L93
        L91:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L93
            return r4
        L93:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L93
            throw r9
    }
}
