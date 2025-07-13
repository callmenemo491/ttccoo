package p112g9;

/* renamed from: g9.g */
/* loaded from: classes.dex */
public class C2305g extends p093f9.AbstractC2089g<p204l9.C4222p> {

    /* renamed from: g9.g$a */
    public class a extends p093f9.AbstractC2089g.b<p093f9.InterfaceC2083a, p204l9.C4222p> {
        public a(java.lang.Class r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // p093f9.AbstractC2089g.b
        /* renamed from: a */
        public p093f9.InterfaceC2083a mo5523a(p204l9.C4222p r2) {
                r1 = this;
                l9.p r2 = (p204l9.C4222p) r2
                n9.i r0 = new n9.i
                m9.h r2 = r2.m9492z()
                byte[] r2 = r2.m10063w()
                r0.<init>(r2)
                return r0
        }
    }

    /* renamed from: g9.g$b */
    public class b extends p093f9.AbstractC2089g.a<p204l9.C4223q, p204l9.C4222p> {

        /* renamed from: b */
        public final /* synthetic */ p112g9.C2305g f10523b;

        public b(p112g9.C2305g r1, java.lang.Class r2) {
                r0 = this;
                r0.f10523b = r1
                r0.<init>(r2)
                return
        }

        @Override // p093f9.AbstractC2089g.a
        /* renamed from: a */
        public p204l9.C4222p mo5520a(p221m9.InterfaceC4482q0 r4) {
                r3 = this;
                l9.q r4 = (p204l9.C4223q) r4
                l9.p$b r4 = p204l9.C4222p.m9486B()
                g9.g r0 = r3.f10523b
                java.util.Objects.requireNonNull(r0)
                r4.m10377o()
                MessageType extends m9.x<MessageType, BuilderType> r0 = r4.f18293Z
                l9.p r0 = (p204l9.C4222p) r0
                r1 = 0
                p204l9.C4222p.m9489x(r0, r1)
                r0 = 32
                byte[] r0 = p236n9.C4716q.m10773a(r0)
                int r2 = r0.length
                m9.h r0 = p221m9.AbstractC4454h.m10054i(r0, r1, r2)
                r4.m10377o()
                MessageType extends m9.x<MessageType, BuilderType> r1 = r4.f18293Z
                l9.p r1 = (p204l9.C4222p) r1
                p204l9.C4222p.m9490y(r1, r0)
                m9.x r4 = r4.m10375k()
                l9.p r4 = (p204l9.C4222p) r4
                return r4
        }

        @Override // p093f9.AbstractC2089g.a
        /* renamed from: b */
        public p221m9.InterfaceC4482q0 mo5521b(p221m9.AbstractC4454h r2) {
                r1 = this;
                m9.p r0 = p221m9.C4478p.m10222a()
                l9.q r2 = p204l9.C4223q.m9494x(r2, r0)
                return r2
        }

        @Override // p093f9.AbstractC2089g.a
        /* renamed from: c */
        public /* bridge */ /* synthetic */ void mo5522c(p221m9.InterfaceC4482q0 r1) {
                r0 = this;
                l9.q r1 = (p204l9.C4223q) r1
                return
        }
    }

    public C2305g() {
            r4 = this;
            java.lang.Class<l9.p> r0 = p204l9.C4222p.class
            r1 = 1
            f9.g$b[] r1 = new p093f9.AbstractC2089g.b[r1]
            g9.g$a r2 = new g9.g$a
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
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"
            return r0
    }

    @Override // p093f9.AbstractC2089g
    /* renamed from: c */
    public p093f9.AbstractC2089g.a<p204l9.C4223q, p204l9.C4222p> mo5516c() {
            r2 = this;
            g9.g$b r0 = new g9.g$b
            java.lang.Class<l9.q> r1 = p204l9.C4223q.class
            r0.<init>(r2, r1)
            return r0
    }

    @Override // p093f9.AbstractC2089g
    /* renamed from: d */
    public p204l9.C4229w.c mo5517d() {
            r1 = this;
            l9.w$c r0 = p204l9.C4229w.c.f17378a0
            return r0
    }

    @Override // p093f9.AbstractC2089g
    /* renamed from: e */
    public p221m9.InterfaceC4482q0 mo5518e(p221m9.AbstractC4454h r2) {
            r1 = this;
            m9.p r0 = p221m9.C4478p.m10222a()
            l9.p r2 = p204l9.C4222p.m9487C(r2, r0)
            return r2
    }

    @Override // p093f9.AbstractC2089g
    /* renamed from: f */
    public void mo5519f(p221m9.InterfaceC4482q0 r3) {
            r2 = this;
            l9.p r3 = (p204l9.C4222p) r3
            int r0 = r3.m9491A()
            r1 = 0
            p236n9.C4717r.m10776c(r0, r1)
            m9.h r3 = r3.m9492z()
            int r3 = r3.size()
            r0 = 32
            if (r3 != r0) goto L17
            return
        L17:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "invalid ChaCha20Poly1305Key: incorrect key length"
            r3.<init>(r0)
            throw r3
    }
}
