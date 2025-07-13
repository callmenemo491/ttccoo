package p239nh;

/* renamed from: nh.b */
/* loaded from: classes.dex */
public abstract class AbstractC4822b implements sh.InterfaceC6072a, java.io.Serializable {

    /* renamed from: Y */
    public transient sh.InterfaceC6072a f19215Y;

    /* renamed from: Z */
    public final java.lang.Object f19216Z;

    /* renamed from: a0 */
    public final java.lang.Class f19217a0;

    /* renamed from: b0 */
    public final java.lang.String f19218b0;

    /* renamed from: c0 */
    public final java.lang.String f19219c0;

    /* renamed from: d0 */
    public final boolean f19220d0;

    /* renamed from: nh.b$a */
    public static class a implements java.io.Serializable {

        /* renamed from: Y */
        public static final p239nh.AbstractC4822b.a f19221Y = null;

        static {
                nh.b$a r0 = new nh.b$a
                r0.<init>()
                p239nh.AbstractC4822b.a.f19221Y = r0
                return
        }

        public a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public AbstractC4822b() {
            r1 = this;
            nh.b$a r0 = p239nh.AbstractC4822b.a.f19221Y
            r1.<init>()
            r1.f19216Z = r0
            r0 = 0
            r1.f19217a0 = r0
            r1.f19218b0 = r0
            r1.f19219c0 = r0
            r0 = 0
            r1.f19220d0 = r0
            return
    }

    public AbstractC4822b(java.lang.Object r1, java.lang.Class r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f19216Z = r1
            r0.f19217a0 = r2
            r0.f19218b0 = r3
            r0.f19219c0 = r4
            r0.f19220d0 = r5
            return
    }

    /* renamed from: a */
    public sh.InterfaceC6072a m10847a() {
            r1 = this;
            sh.a r0 = r1.f19215Y
            if (r0 != 0) goto La
            sh.a r0 = r1.mo10848c()
            r1.f19215Y = r0
        La:
            return r0
    }

    /* renamed from: c */
    public abstract sh.InterfaceC6072a mo10848c();

    /* renamed from: d */
    public sh.InterfaceC6074c m10849d() {
            r3 = this;
            java.lang.Class r0 = r3.f19217a0
            if (r0 != 0) goto L6
            r0 = 0
            goto L1c
        L6:
            boolean r1 = r3.f19220d0
            if (r1 == 0) goto L18
            nh.s r1 = p239nh.C4838r.f19233a
            java.util.Objects.requireNonNull(r1)
            nh.k r1 = new nh.k
            java.lang.String r2 = ""
            r1.<init>(r0, r2)
            r0 = r1
            goto L1c
        L18:
            sh.b r0 = p239nh.C4838r.m10853a(r0)
        L1c:
            return r0
    }
}
