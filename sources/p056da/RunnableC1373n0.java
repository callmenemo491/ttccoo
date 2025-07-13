package p056da;

/* renamed from: da.n0 */
/* loaded from: classes.dex */
public class RunnableC1373n0 implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ java.util.concurrent.Callable f6940Y;

    /* renamed from: Z */
    public final /* synthetic */ p327s7.C5986j f6941Z;

    /* renamed from: da.n0$a */
    public class a implements p327s7.InterfaceC5977a<java.lang.Object, java.lang.Void> {

        /* renamed from: Y */
        public final /* synthetic */ p056da.RunnableC1373n0 f6942Y;

        public a(p056da.RunnableC1373n0 r1) {
                r0 = this;
                r0.f6942Y = r1
                r0.<init>()
                return
        }

        @Override // p327s7.InterfaceC5977a
        /* renamed from: g */
        public java.lang.Void mo816g(p327s7.AbstractC5985i<java.lang.Object> r2) {
                r1 = this;
                boolean r0 = r2.mo12455m()
                if (r0 == 0) goto L14
                da.n0 r0 = r1.f6942Y
                s7.j r0 = r0.f6941Z
                java.lang.Object r2 = r2.mo12451i()
                s7.q<TResult> r0 = r0.f23075a
                r0.m12473r(r2)
                goto L21
            L14:
                da.n0 r0 = r1.f6942Y
                s7.j r0 = r0.f6941Z
                java.lang.Exception r2 = r2.mo12450h()
                s7.q<TResult> r0 = r0.f23075a
                r0.m12472q(r2)
            L21:
                r2 = 0
                return r2
        }
    }

    public RunnableC1373n0(java.util.concurrent.Callable r1, p327s7.C5986j r2) {
            r0 = this;
            r0.f6940Y = r1
            r0.f6941Z = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            java.util.concurrent.Callable r0 = r2.f6940Y     // Catch: java.lang.Exception -> L11
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L11
            s7.i r0 = (p327s7.AbstractC5985i) r0     // Catch: java.lang.Exception -> L11
            da.n0$a r1 = new da.n0$a     // Catch: java.lang.Exception -> L11
            r1.<init>(r2)     // Catch: java.lang.Exception -> L11
            r0.mo12448f(r1)     // Catch: java.lang.Exception -> L11
            goto L19
        L11:
            r0 = move-exception
            s7.j r1 = r2.f6941Z
            s7.q<TResult> r1 = r1.f23075a
            r1.m12472q(r0)
        L19:
            return
    }
}
