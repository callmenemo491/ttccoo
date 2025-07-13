package p126h9;

/* renamed from: h9.a */
/* loaded from: classes.dex */
public final class C2991a extends p093f9.AbstractC2089g<p204l9.C4220n> {

    /* renamed from: h9.a$a */
    public class a extends p093f9.AbstractC2089g.b<p093f9.InterfaceC2085c, p204l9.C4220n> {
        public a(java.lang.Class r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // p093f9.AbstractC2089g.b
        /* renamed from: a */
        public p093f9.InterfaceC2085c mo5523a(p204l9.C4220n r2) {
                r1 = this;
                l9.n r2 = (p204l9.C4220n) r2
                n9.e r0 = new n9.e
                m9.h r2 = r2.m9480z()
                byte[] r2 = r2.m10063w()
                r0.<init>(r2)
                return r0
        }
    }

    /* renamed from: h9.a$b */
    public class b extends p093f9.AbstractC2089g.a<p204l9.C4221o, p204l9.C4220n> {

        /* renamed from: b */
        public final /* synthetic */ p126h9.C2991a f12080b;

        public b(p126h9.C2991a r1, java.lang.Class r2) {
                r0 = this;
                r0.f12080b = r1
                r0.<init>(r2)
                return
        }

        @Override // p093f9.AbstractC2089g.a
        /* renamed from: a */
        public p204l9.C4220n mo5520a(p221m9.InterfaceC4482q0 r4) {
                r3 = this;
                l9.o r4 = (p204l9.C4221o) r4
                l9.n$b r0 = p204l9.C4220n.m9474B()
                int r4 = r4.m9485y()
                byte[] r4 = p236n9.C4716q.m10773a(r4)
                int r1 = r4.length
                r2 = 0
                m9.h r4 = p221m9.AbstractC4454h.m10054i(r4, r2, r1)
                r0.m10377o()
                MessageType extends m9.x<MessageType, BuilderType> r1 = r0.f18293Z
                l9.n r1 = (p204l9.C4220n) r1
                p204l9.C4220n.m9478y(r1, r4)
                h9.a r4 = r3.f12080b
                java.util.Objects.requireNonNull(r4)
                r0.m10377o()
                MessageType extends m9.x<MessageType, BuilderType> r4 = r0.f18293Z
                l9.n r4 = (p204l9.C4220n) r4
                p204l9.C4220n.m9477x(r4, r2)
                m9.x r4 = r0.m10375k()
                l9.n r4 = (p204l9.C4220n) r4
                return r4
        }

        @Override // p093f9.AbstractC2089g.a
        /* renamed from: b */
        public p221m9.InterfaceC4482q0 mo5521b(p221m9.AbstractC4454h r2) {
                r1 = this;
                m9.p r0 = p221m9.C4478p.m10222a()
                l9.o r2 = p204l9.C4221o.m9481A(r2, r0)
                return r2
        }

        @Override // p093f9.AbstractC2089g.a
        /* renamed from: c */
        public void mo5522c(p221m9.InterfaceC4482q0 r3) {
                r2 = this;
                l9.o r3 = (p204l9.C4221o) r3
                int r0 = r3.m9485y()
                r1 = 64
                if (r0 != r1) goto Lb
                return
            Lb:
                java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
                java.lang.String r1 = "invalid key size: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                int r3 = r3.m9485y()
                r1.append(r3)
                java.lang.String r3 = ". Valid keys must have 64 bytes."
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }
    }

    public C2991a() {
            r4 = this;
            java.lang.Class<l9.n> r0 = p204l9.C4220n.class
            r1 = 1
            f9.g$b[] r1 = new p093f9.AbstractC2089g.b[r1]
            h9.a$a r2 = new h9.a$a
            java.lang.Class<f9.c> r3 = p093f9.InterfaceC2085c.class
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
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesSivKey"
            return r0
    }

    @Override // p093f9.AbstractC2089g
    /* renamed from: c */
    public p093f9.AbstractC2089g.a<p204l9.C4221o, p204l9.C4220n> mo5516c() {
            r2 = this;
            h9.a$b r0 = new h9.a$b
            java.lang.Class<l9.o> r1 = p204l9.C4221o.class
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
            l9.n r2 = p204l9.C4220n.m9475C(r2, r0)
            return r2
    }

    @Override // p093f9.AbstractC2089g
    /* renamed from: f */
    public void mo5519f(p221m9.InterfaceC4482q0 r3) {
            r2 = this;
            l9.n r3 = (p204l9.C4220n) r3
            int r0 = r3.m9479A()
            r1 = 0
            p236n9.C4717r.m10776c(r0, r1)
            m9.h r0 = r3.m9480z()
            int r0 = r0.size()
            r1 = 64
            if (r0 != r1) goto L17
            return
        L17:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            java.lang.String r1 = "invalid key size: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            m9.h r3 = r3.m9480z()
            int r3 = r3.size()
            r1.append(r3)
            java.lang.String r3 = ". Valid keys must have 64 bytes."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}
