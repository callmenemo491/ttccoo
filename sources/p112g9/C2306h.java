package p112g9;

/* renamed from: g9.h */
/* loaded from: classes.dex */
public class C2306h extends p093f9.AbstractC2089g<p204l9.C4202c0> {

    /* renamed from: g9.h$a */
    public class a extends p093f9.AbstractC2089g.b<p093f9.InterfaceC2083a, p204l9.C4202c0> {
        public a(java.lang.Class r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // p093f9.AbstractC2089g.b
        /* renamed from: a */
        public p093f9.InterfaceC2083a mo5523a(p204l9.C4202c0 r2) {
                r1 = this;
                l9.c0 r2 = (p204l9.C4202c0) r2
                l9.d0 r2 = r2.m9386z()
                java.lang.String r2 = r2.m9399y()
                f9.k r0 = p093f9.C2094l.m5535a(r2)
                f9.a r2 = r0.mo5533a(r2)
                return r2
        }
    }

    /* renamed from: g9.h$b */
    public class b extends p093f9.AbstractC2089g.a<p204l9.C4204d0, p204l9.C4202c0> {

        /* renamed from: b */
        public final /* synthetic */ p112g9.C2306h f10524b;

        public b(p112g9.C2306h r1, java.lang.Class r2) {
                r0 = this;
                r0.f10524b = r1
                r0.<init>(r2)
                return
        }

        @Override // p093f9.AbstractC2089g.a
        /* renamed from: a */
        public p204l9.C4202c0 mo5520a(p221m9.InterfaceC4482q0 r3) {
                r2 = this;
                l9.d0 r3 = (p204l9.C4204d0) r3
                l9.c0$b r0 = p204l9.C4202c0.m9380B()
                r0.m10377o()
                MessageType extends m9.x<MessageType, BuilderType> r1 = r0.f18293Z
                l9.c0 r1 = (p204l9.C4202c0) r1
                p204l9.C4202c0.m9384y(r1, r3)
                g9.h r3 = r2.f10524b
                java.util.Objects.requireNonNull(r3)
                r3 = 0
                r0.m10377o()
                MessageType extends m9.x<MessageType, BuilderType> r1 = r0.f18293Z
                l9.c0 r1 = (p204l9.C4202c0) r1
                p204l9.C4202c0.m9383x(r1, r3)
                m9.x r3 = r0.m10375k()
                l9.c0 r3 = (p204l9.C4202c0) r3
                return r3
        }

        @Override // p093f9.AbstractC2089g.a
        /* renamed from: b */
        public p221m9.InterfaceC4482q0 mo5521b(p221m9.AbstractC4454h r2) {
                r1 = this;
                m9.p r0 = p221m9.C4478p.m10222a()
                l9.d0 r2 = p204l9.C4204d0.m9398z(r2, r0)
                return r2
        }

        @Override // p093f9.AbstractC2089g.a
        /* renamed from: c */
        public /* bridge */ /* synthetic */ void mo5522c(p221m9.InterfaceC4482q0 r1) {
                r0 = this;
                l9.d0 r1 = (p204l9.C4204d0) r1
                return
        }
    }

    public C2306h() {
            r4 = this;
            java.lang.Class<l9.c0> r0 = p204l9.C4202c0.class
            r1 = 1
            f9.g$b[] r1 = new p093f9.AbstractC2089g.b[r1]
            g9.h$a r2 = new g9.h$a
            java.lang.Class<f9.a> r3 = p093f9.InterfaceC2083a.class
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    @Override // p093f9.AbstractC2089g
    /* renamed from: a */
    public java.lang.String mo5514a() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.KmsAeadKey"
            return r0
    }

    @Override // p093f9.AbstractC2089g
    /* renamed from: c */
    public p093f9.AbstractC2089g.a<p204l9.C4204d0, p204l9.C4202c0> mo5516c() {
            r2 = this;
            g9.h$b r0 = new g9.h$b
            java.lang.Class<l9.d0> r1 = p204l9.C4204d0.class
            r0.<init>(r2, r1)
            return r0
    }

    @Override // p093f9.AbstractC2089g
    /* renamed from: d */
    public p204l9.C4229w.c mo5517d() {
            r1 = this;
            l9.w$c r0 = p204l9.C4229w.c.f17381d0
            return r0
    }

    @Override // p093f9.AbstractC2089g
    /* renamed from: e */
    public p221m9.InterfaceC4482q0 mo5518e(p221m9.AbstractC4454h r2) {
            r1 = this;
            m9.p r0 = p221m9.C4478p.m10222a()
            l9.c0 r2 = p204l9.C4202c0.m9381C(r2, r0)
            return r2
    }

    @Override // p093f9.AbstractC2089g
    /* renamed from: f */
    public void mo5519f(p221m9.InterfaceC4482q0 r2) {
            r1 = this;
            l9.c0 r2 = (p204l9.C4202c0) r2
            int r2 = r2.m9385A()
            r0 = 0
            p236n9.C4717r.m10776c(r2, r0)
            return
    }
}
