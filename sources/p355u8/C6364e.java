package p355u8;

/* renamed from: u8.e */
/* loaded from: classes.dex */
public class C6364e {

    /* renamed from: c */
    public static p355u8.C6364e f24830c;

    /* renamed from: a */
    public final java.lang.Object f24831a;

    /* renamed from: b */
    public final android.os.Handler f24832b;

    /* renamed from: u8.e$a */
    public class a implements android.os.Handler.Callback {

        /* renamed from: Y */
        public final /* synthetic */ p355u8.C6364e f24833Y;

        public a(p355u8.C6364e r1) {
                r0 = this;
                r0.f24833Y = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message r2) {
                r1 = this;
                int r0 = r2.what
                if (r0 == 0) goto L6
                r2 = 0
                return r2
            L6:
                u8.e r0 = r1.f24833Y
                java.lang.Object r2 = r2.obj
                u8.e$b r2 = (p355u8.C6364e.b) r2
                java.lang.Object r0 = r0.f24831a
                monitor-enter(r0)
                if (r2 == 0) goto L14
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r2 = 1
                return r2
            L14:
                java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Throwable -> L19
                r2 = 0
                throw r2     // Catch: java.lang.Throwable -> L19
            L19:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r2
        }
    }

    /* renamed from: u8.e$b */
    public static class b {
    }

    public C6364e() {
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.f24831a = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            u8.e$a r2 = new u8.e$a
            r2.<init>(r3)
            r0.<init>(r1, r2)
            r3.f24832b = r0
            return
    }
}
