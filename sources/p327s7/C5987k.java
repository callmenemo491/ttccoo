package p327s7;

/* renamed from: s7.k */
/* loaded from: classes.dex */
public final class C5987k {

    /* renamed from: a */
    public static final java.util.concurrent.Executor f23076a = null;

    /* renamed from: b */
    public static final java.util.concurrent.Executor f23077b = null;

    /* renamed from: s7.k$a */
    public static final class a implements java.util.concurrent.Executor {

        /* renamed from: Y */
        public final android.os.Handler f23078Y;

        public a() {
                r2 = this;
                r2.<init>()
                l7.a r0 = new l7.a
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                r2.f23078Y = r0
                return
        }

        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable r2) {
                r1 = this;
                android.os.Handler r0 = r1.f23078Y
                r0.post(r2)
                return
        }
    }

    static {
            s7.k$a r0 = new s7.k$a
            r0.<init>()
            p327s7.C5987k.f23076a = r0
            s7.p r0 = new s7.p
            r0.<init>()
            p327s7.C5987k.f23077b = r0
            return
    }
}
