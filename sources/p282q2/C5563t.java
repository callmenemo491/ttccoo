package p282q2;

/* renamed from: q2.t */
/* loaded from: classes.dex */
public class C5563t<Model> implements p282q2.InterfaceC5556m<Model, Model> {

    /* renamed from: a */
    public static final p282q2.C5563t<?> f21656a = null;

    /* renamed from: q2.t$a */
    public static class a<Model> implements p282q2.InterfaceC5557n<Model, Model> {

        /* renamed from: a */
        public static final p282q2.C5563t.a<?> f21657a = null;

        static {
                q2.t$a r0 = new q2.t$a
                r0.<init>()
                p282q2.C5563t.a.f21657a = r0
                return
        }

        @java.lang.Deprecated
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p282q2.InterfaceC5557n
        /* renamed from: b */
        public p282q2.InterfaceC5556m<Model, Model> mo9584b(p282q2.C5560q r1) {
                r0 = this;
                q2.t<?> r1 = p282q2.C5563t.f21656a
                return r1
        }
    }

    /* renamed from: q2.t$b */
    public static class b<Model> implements com.bumptech.glide.load.data.InterfaceC1016d<Model> {

        /* renamed from: Y */
        public final Model f21658Y;

        public b(Model r1) {
                r0 = this;
                r0.<init>()
                r0.f21658Y = r1
                return
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        /* renamed from: a */
        public java.lang.Class<Model> mo2786a() {
                r1 = this;
                Model r0 = r1.f21658Y
                java.lang.Class r0 = r0.getClass()
                return r0
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        /* renamed from: b */
        public void mo2789b() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        public void cancel() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        /* renamed from: e */
        public com.bumptech.glide.load.EnumC1008a mo2792e() {
                r1 = this;
                com.bumptech.glide.load.a r0 = com.bumptech.glide.load.EnumC1008a.f5180Y
                return r0
        }

        @Override // com.bumptech.glide.load.data.InterfaceC1016d
        /* renamed from: f */
        public void mo2793f(com.bumptech.glide.EnumC1003g r1, com.bumptech.glide.load.data.InterfaceC1016d.a<? super Model> r2) {
                r0 = this;
                Model r1 = r0.f21658Y
                r2.mo2795d(r1)
                return
        }
    }

    static {
            q2.t r0 = new q2.t
            r0.<init>()
            p282q2.C5563t.f21656a = r0
            return
    }

    @java.lang.Deprecated
    public C5563t() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: a */
    public p282q2.InterfaceC5556m.a<Model> mo9582a(Model r1, int r2, int r3, p180k2.C3673e r4) {
            r0 = this;
            q2.m$a r2 = new q2.m$a
            f3.b r3 = new f3.b
            r3.<init>(r1)
            q2.t$b r4 = new q2.t$b
            r4.<init>(r1)
            r2.<init>(r3, r4)
            return r2
    }

    @Override // p282q2.InterfaceC5556m
    /* renamed from: b */
    public boolean mo9583b(Model r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
