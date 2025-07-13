package p178k0;

/* renamed from: k0.o */
/* loaded from: classes.dex */
public class RunnableC3639o<T> implements java.lang.Runnable {

    /* renamed from: Y */
    public java.util.concurrent.Callable<T> f16042Y;

    /* renamed from: Z */
    public p212m0.InterfaceC4311a<T> f16043Z;

    /* renamed from: a0 */
    public android.os.Handler f16044a0;

    /* renamed from: k0.o$a */
    public class a implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ p212m0.InterfaceC4311a f16045Y;

        /* renamed from: Z */
        public final /* synthetic */ java.lang.Object f16046Z;

        public a(p178k0.RunnableC3639o r1, p212m0.InterfaceC4311a r2, java.lang.Object r3) {
                r0 = this;
                r0.f16045Y = r2
                r0.f16046Z = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                m0.a r0 = r2.f16045Y
                java.lang.Object r1 = r2.f16046Z
                r0.mo8073a(r1)
                return
        }
    }

    public RunnableC3639o(android.os.Handler r1, java.util.concurrent.Callable<T> r2, p212m0.InterfaceC4311a<T> r3) {
            r0 = this;
            r0.<init>()
            r0.f16042Y = r2
            r0.f16043Z = r3
            r0.f16044a0 = r1
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r4 = this;
            java.util.concurrent.Callable<T> r0 = r4.f16042Y     // Catch: java.lang.Exception -> L7
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L7
            goto L8
        L7:
            r0 = 0
        L8:
            m0.a<T> r1 = r4.f16043Z
            android.os.Handler r2 = r4.f16044a0
            k0.o$a r3 = new k0.o$a
            r3.<init>(r4, r1, r0)
            r2.post(r3)
            return
    }
}
