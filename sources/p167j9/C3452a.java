package p167j9;

/* renamed from: j9.a */
/* loaded from: classes.dex */
public final class C3452a extends p093f9.AbstractC2089g<p204l9.C4197a> {

    /* renamed from: j9.a$a */
    public class a extends p093f9.AbstractC2089g.b<p093f9.InterfaceC2095m, p204l9.C4197a> {
        public a(java.lang.Class r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // p093f9.AbstractC2089g.b
        /* renamed from: a */
        public p093f9.InterfaceC2095m mo5523a(p204l9.C4197a r3) {
                r2 = this;
                l9.a r3 = (p204l9.C4197a) r3
                n9.a r0 = new n9.a
                m9.h r1 = r3.m9337A()
                byte[] r1 = r1.m10063w()
                l9.c r3 = r3.m9338B()
                int r3 = r3.m9379y()
                r0.<init>(r1, r3)
                return r0
        }
    }

    /* renamed from: j9.a$b */
    public class b extends p093f9.AbstractC2089g.a<p204l9.C4199b, p204l9.C4197a> {
        public b(p167j9.C3452a r1, java.lang.Class r2) {
                r0 = this;
                r0.<init>(r2)
                return
        }

        @Override // p093f9.AbstractC2089g.a
        /* renamed from: a */
        public p204l9.C4197a mo5520a(p221m9.InterfaceC4482q0 r5) {
                r4 = this;
                l9.b r5 = (p204l9.C4199b) r5
                l9.a$b r0 = p204l9.C4197a.m9331D()
                r0.m10377o()
                MessageType extends m9.x<MessageType, BuilderType> r1 = r0.f18293Z
                l9.a r1 = (p204l9.C4197a) r1
                r2 = 0
                p204l9.C4197a.m9334x(r1, r2)
                int r1 = r5.m9363x()
                byte[] r1 = p236n9.C4716q.m10773a(r1)
                int r3 = r1.length
                m9.h r1 = p221m9.AbstractC4454h.m10054i(r1, r2, r3)
                r0.m10377o()
                MessageType extends m9.x<MessageType, BuilderType> r2 = r0.f18293Z
                l9.a r2 = (p204l9.C4197a) r2
                p204l9.C4197a.m9335y(r2, r1)
                l9.c r5 = r5.m9364y()
                r0.m10377o()
                MessageType extends m9.x<MessageType, BuilderType> r1 = r0.f18293Z
                l9.a r1 = (p204l9.C4197a) r1
                p204l9.C4197a.m9336z(r1, r5)
                m9.x r5 = r0.m10375k()
                l9.a r5 = (p204l9.C4197a) r5
                return r5
        }

        @Override // p093f9.AbstractC2089g.a
        /* renamed from: b */
        public p221m9.InterfaceC4482q0 mo5521b(p221m9.AbstractC4454h r2) {
                r1 = this;
                m9.p r0 = p221m9.C4478p.m10222a()
                l9.b r2 = p204l9.C4199b.m9362z(r2, r0)
                return r2
        }

        @Override // p093f9.AbstractC2089g.a
        /* renamed from: c */
        public void mo5522c(p221m9.InterfaceC4482q0 r2) {
                r1 = this;
                l9.b r2 = (p204l9.C4199b) r2
                l9.c r0 = r2.m9364y()
                p167j9.C3452a.m7913g(r0)
                int r2 = r2.m9363x()
                r0 = 32
                if (r2 != r0) goto L12
                return
            L12:
                java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
                java.lang.String r0 = "AesCmacKey size wrong, must be 16 bytes"
                r2.<init>(r0)
                throw r2
        }
    }

    public C3452a() {
            r4 = this;
            java.lang.Class<l9.a> r0 = p204l9.C4197a.class
            r1 = 1
            f9.g$b[] r1 = new p093f9.AbstractC2089g.b[r1]
            j9.a$a r2 = new j9.a$a
            java.lang.Class<f9.m> r3 = p093f9.InterfaceC2095m.class
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    /* renamed from: g */
    public static void m7913g(p204l9.C4201c r2) {
            int r0 = r2.m9379y()
            r1 = 10
            if (r0 < r1) goto L19
            int r2 = r2.m9379y()
            r0 = 16
            if (r2 > r0) goto L11
            return
        L11:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = "tag size too long"
            r2.<init>(r0)
            throw r2
        L19:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = "tag size too short"
            r2.<init>(r0)
            throw r2
    }

    @Override // p093f9.AbstractC2089g
    /* renamed from: a */
    public java.lang.String mo5514a() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesCmacKey"
            return r0
    }

    @Override // p093f9.AbstractC2089g
    /* renamed from: c */
    public p093f9.AbstractC2089g.a<p204l9.C4199b, p204l9.C4197a> mo5516c() {
            r2 = this;
            j9.a$b r0 = new j9.a$b
            java.lang.Class<l9.b> r1 = p204l9.C4199b.class
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
            l9.a r2 = p204l9.C4197a.m9332E(r2, r0)
            return r2
    }

    @Override // p093f9.AbstractC2089g
    /* renamed from: f */
    public void mo5519f(p221m9.InterfaceC4482q0 r3) {
            r2 = this;
            l9.a r3 = (p204l9.C4197a) r3
            int r0 = r3.m9339C()
            r1 = 0
            p236n9.C4717r.m10776c(r0, r1)
            m9.h r0 = r3.m9337A()
            int r0 = r0.size()
            r1 = 32
            if (r0 != r1) goto L1e
            l9.c r3 = r3.m9338B()
            m7913g(r3)
            return
        L1e:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "AesCmacKey size wrong, must be 16 bytes"
            r3.<init>(r0)
            throw r3
    }
}
