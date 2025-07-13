package p379vh;

/* renamed from: vh.b1 */
/* loaded from: classes.dex */
public interface InterfaceC6687b1 extends p101fh.InterfaceC2175g.a {

    /* renamed from: X */
    public static final /* synthetic */ int f25957X = 0;

    /* renamed from: vh.b1$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m13556a(p379vh.InterfaceC6687b1 r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
                r1 = 0
                r0.mo13553d0(r1)
                return
        }

        /* renamed from: b */
        public static /* synthetic */ p379vh.InterfaceC6719m0 m13557b(p379vh.InterfaceC6687b1 r0, boolean r1, boolean r2, mh.InterfaceC4620l r3, int r4, java.lang.Object r5) {
                r5 = r4 & 1
                if (r5 == 0) goto L5
                r1 = 0
            L5:
                r4 = r4 & 2
                if (r4 == 0) goto La
                r2 = 1
            La:
                vh.m0 r0 = r0.mo13554m0(r1, r2, r3)
                return r0
        }
    }

    /* renamed from: vh.b1$b */
    public static final class b implements p101fh.InterfaceC2175g.b<p379vh.InterfaceC6687b1> {

        /* renamed from: Y */
        public static final /* synthetic */ p379vh.InterfaceC6687b1.b f25958Y = null;

        static {
                vh.b1$b r0 = new vh.b1$b
                r0.<init>()
                p379vh.InterfaceC6687b1.b.f25958Y = r0
                return
        }

        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: A */
    th.InterfaceC6246d<p379vh.InterfaceC6687b1> mo13550A();

    /* renamed from: S */
    java.util.concurrent.CancellationException mo13551S();

    /* renamed from: Z */
    p379vh.InterfaceC6718m mo13552Z(p379vh.InterfaceC6724o r1);

    /* renamed from: a */
    boolean mo13544a();

    /* renamed from: d0 */
    void mo13553d0(java.util.concurrent.CancellationException r1);

    /* renamed from: m0 */
    p379vh.InterfaceC6719m0 mo13554m0(boolean r1, boolean r2, mh.InterfaceC4620l<? super java.lang.Throwable, ch.C0985l> r3);

    /* renamed from: n */
    p379vh.InterfaceC6719m0 mo13555n(mh.InterfaceC4620l<? super java.lang.Throwable, ch.C0985l> r1);

    boolean start();
}
