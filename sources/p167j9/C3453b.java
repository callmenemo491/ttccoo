package p167j9;

/* renamed from: j9.b */
/* loaded from: classes.dex */
public final class C3453b extends p093f9.AbstractC2089g<p204l9.C4226t> {

    /* renamed from: j9.b$a */
    public class a extends p093f9.AbstractC2089g.b<p093f9.InterfaceC2095m, p204l9.C4226t> {
        public a(java.lang.Class r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // p093f9.AbstractC2089g.b
        /* renamed from: a */
        public p093f9.InterfaceC2095m mo5523a(p204l9.C4226t r5) {
                r4 = this;
                l9.t r5 = (p204l9.C4226t) r5
                l9.v r0 = r5.m9510C()
                l9.s r0 = r0.m9519y()
                m9.h r1 = r5.m9509B()
                byte[] r1 = r1.m10063w()
                javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec
                java.lang.String r3 = "HMAC"
                r2.<init>(r1, r3)
                l9.v r5 = r5.m9510C()
                int r5 = r5.m9520z()
                int r0 = r0.ordinal()
                r1 = 1
                if (r0 == r1) goto L50
                r1 = 3
                if (r0 == r1) goto L43
                r1 = 4
                if (r0 != r1) goto L3b
                n9.p r0 = new n9.p
                n9.o r1 = new n9.o
                java.lang.String r3 = "HMACSHA512"
                r1.<init>(r3, r2)
                r0.<init>(r1, r5)
                goto L5c
            L3b:
                java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
                java.lang.String r0 = "unknown hash"
                r5.<init>(r0)
                throw r5
            L43:
                n9.p r0 = new n9.p
                n9.o r1 = new n9.o
                java.lang.String r3 = "HMACSHA256"
                r1.<init>(r3, r2)
                r0.<init>(r1, r5)
                goto L5c
            L50:
                n9.p r0 = new n9.p
                n9.o r1 = new n9.o
                java.lang.String r3 = "HMACSHA1"
                r1.<init>(r3, r2)
                r0.<init>(r1, r5)
            L5c:
                return r0
        }
    }

    /* renamed from: j9.b$b */
    public class b extends p093f9.AbstractC2089g.a<p204l9.C4227u, p204l9.C4226t> {

        /* renamed from: b */
        public final /* synthetic */ p167j9.C3453b f14924b;

        public b(p167j9.C3453b r1, java.lang.Class r2) {
                r0 = this;
                r0.f14924b = r1
                r0.<init>(r2)
                return
        }

        @Override // p093f9.AbstractC2089g.a
        /* renamed from: a */
        public p204l9.C4226t mo5520a(p221m9.InterfaceC4482q0 r5) {
                r4 = this;
                l9.u r5 = (p204l9.C4227u) r5
                l9.t$b r0 = p204l9.C4226t.m9503E()
                j9.b r1 = r4.f14924b
                java.util.Objects.requireNonNull(r1)
                r0.m10377o()
                MessageType extends m9.x<MessageType, BuilderType> r1 = r0.f18293Z
                l9.t r1 = (p204l9.C4226t) r1
                r2 = 0
                p204l9.C4226t.m9506x(r1, r2)
                l9.v r1 = r5.m9516z()
                r0.m10377o()
                MessageType extends m9.x<MessageType, BuilderType> r3 = r0.f18293Z
                l9.t r3 = (p204l9.C4226t) r3
                p204l9.C4226t.m9507y(r3, r1)
                int r5 = r5.m9515y()
                byte[] r5 = p236n9.C4716q.m10773a(r5)
                int r1 = r5.length
                m9.h r5 = p221m9.AbstractC4454h.m10054i(r5, r2, r1)
                r0.m10377o()
                MessageType extends m9.x<MessageType, BuilderType> r1 = r0.f18293Z
                l9.t r1 = (p204l9.C4226t) r1
                p204l9.C4226t.m9508z(r1, r5)
                m9.x r5 = r0.m10375k()
                l9.t r5 = (p204l9.C4226t) r5
                return r5
        }

        @Override // p093f9.AbstractC2089g.a
        /* renamed from: b */
        public p221m9.InterfaceC4482q0 mo5521b(p221m9.AbstractC4454h r2) {
                r1 = this;
                m9.p r0 = p221m9.C4478p.m10222a()
                l9.u r2 = p204l9.C4227u.m9512A(r2, r0)
                return r2
        }

        @Override // p093f9.AbstractC2089g.a
        /* renamed from: c */
        public void mo5522c(p221m9.InterfaceC4482q0 r3) {
                r2 = this;
                l9.u r3 = (p204l9.C4227u) r3
                int r0 = r3.m9515y()
                r1 = 16
                if (r0 < r1) goto L12
                l9.v r3 = r3.m9516z()
                p167j9.C3453b.m7914h(r3)
                return
            L12:
                java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
                java.lang.String r0 = "key too short"
                r3.<init>(r0)
                throw r3
        }
    }

    public C3453b() {
            r4 = this;
            java.lang.Class<l9.t> r0 = p204l9.C4226t.class
            r1 = 1
            f9.g$b[] r1 = new p093f9.AbstractC2089g.b[r1]
            j9.b$a r2 = new j9.b$a
            java.lang.Class<f9.m> r3 = p093f9.InterfaceC2095m.class
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    /* renamed from: h */
    public static void m7914h(p204l9.C4228v r3) {
            int r0 = r3.m9520z()
            r1 = 10
            if (r0 < r1) goto L50
            l9.s r0 = r3.m9519y()
            int r0 = r0.ordinal()
            r1 = 1
            java.lang.String r2 = "tag size too big"
            if (r0 == r1) goto L41
            r1 = 3
            if (r0 == r1) goto L32
            r1 = 4
            if (r0 != r1) goto L2a
            int r3 = r3.m9520z()
            r0 = 64
            if (r3 > r0) goto L24
            goto L49
        L24:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            r3.<init>(r2)
            throw r3
        L2a:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unknown hash type"
            r3.<init>(r0)
            throw r3
        L32:
            int r3 = r3.m9520z()
            r0 = 32
            if (r3 > r0) goto L3b
            goto L49
        L3b:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            r3.<init>(r2)
            throw r3
        L41:
            int r3 = r3.m9520z()
            r0 = 20
            if (r3 > r0) goto L4a
        L49:
            return
        L4a:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            r3.<init>(r2)
            throw r3
        L50:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "tag size too small"
            r3.<init>(r0)
            throw r3
    }

    @Override // p093f9.AbstractC2089g
    /* renamed from: a */
    public java.lang.String mo5514a() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.HmacKey"
            return r0
    }

    @Override // p093f9.AbstractC2089g
    /* renamed from: c */
    public p093f9.AbstractC2089g.a<p204l9.C4227u, p204l9.C4226t> mo5516c() {
            r2 = this;
            j9.b$b r0 = new j9.b$b
            java.lang.Class<l9.u> r1 = p204l9.C4227u.class
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
            l9.t r2 = p204l9.C4226t.m9504F(r2, r0)
            return r2
    }

    @Override // p093f9.AbstractC2089g
    /* renamed from: f */
    public /* bridge */ /* synthetic */ void mo5519f(p221m9.InterfaceC4482q0 r1) {
            r0 = this;
            l9.t r1 = (p204l9.C4226t) r1
            r0.m7915g(r1)
            return
    }

    /* renamed from: g */
    public void m7915g(p204l9.C4226t r3) {
            r2 = this;
            int r0 = r3.m9511D()
            r1 = 0
            p236n9.C4717r.m10776c(r0, r1)
            m9.h r0 = r3.m9509B()
            int r0 = r0.size()
            r1 = 16
            if (r0 < r1) goto L1c
            l9.v r3 = r3.m9510C()
            m7914h(r3)
            return
        L1c:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "key too short"
            r3.<init>(r0)
            throw r3
    }
}
