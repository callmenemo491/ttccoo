package p112g9;

/* renamed from: g9.e */
/* loaded from: classes.dex */
public final class C2303e extends p093f9.AbstractC2089g<p204l9.C4213i> {

    /* renamed from: g9.e$a */
    public class a extends p093f9.AbstractC2089g.b<p093f9.InterfaceC2083a, p204l9.C4213i> {
        public a(java.lang.Class r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // p093f9.AbstractC2089g.b
        /* renamed from: a */
        public p093f9.InterfaceC2083a mo5523a(p204l9.C4213i r3) {
                r2 = this;
                l9.i r3 = (p204l9.C4213i) r3
                n9.c r0 = new n9.c
                m9.h r1 = r3.m9443A()
                byte[] r1 = r1.m10063w()
                l9.k r3 = r3.m9444B()
                int r3 = r3.m9461y()
                r0.<init>(r1, r3)
                return r0
        }
    }

    /* renamed from: g9.e$b */
    public class b extends p093f9.AbstractC2089g.a<p204l9.C4215j, p204l9.C4213i> {

        /* renamed from: b */
        public final /* synthetic */ p112g9.C2303e f10521b;

        public b(p112g9.C2303e r1, java.lang.Class r2) {
                r0 = this;
                r0.f10521b = r1
                r0.<init>(r2)
                return
        }

        @Override // p093f9.AbstractC2089g.a
        /* renamed from: a */
        public p204l9.C4213i mo5520a(p221m9.InterfaceC4482q0 r5) {
                r4 = this;
                l9.j r5 = (p204l9.C4215j) r5
                l9.i$b r0 = p204l9.C4213i.m9437D()
                int r1 = r5.m9455x()
                byte[] r1 = p236n9.C4716q.m10773a(r1)
                int r2 = r1.length
                r3 = 0
                m9.h r1 = p221m9.AbstractC4454h.m10054i(r1, r3, r2)
                r0.m10377o()
                MessageType extends m9.x<MessageType, BuilderType> r2 = r0.f18293Z
                l9.i r2 = (p204l9.C4213i) r2
                p204l9.C4213i.m9442z(r2, r1)
                l9.k r5 = r5.m9456y()
                r0.m10377o()
                MessageType extends m9.x<MessageType, BuilderType> r1 = r0.f18293Z
                l9.i r1 = (p204l9.C4213i) r1
                p204l9.C4213i.m9441y(r1, r5)
                g9.e r5 = r4.f10521b
                java.util.Objects.requireNonNull(r5)
                r0.m10377o()
                MessageType extends m9.x<MessageType, BuilderType> r5 = r0.f18293Z
                l9.i r5 = (p204l9.C4213i) r5
                p204l9.C4213i.m9440x(r5, r3)
                m9.x r5 = r0.m10375k()
                l9.i r5 = (p204l9.C4213i) r5
                return r5
        }

        @Override // p093f9.AbstractC2089g.a
        /* renamed from: b */
        public p221m9.InterfaceC4482q0 mo5521b(p221m9.AbstractC4454h r2) {
                r1 = this;
                m9.p r0 = p221m9.C4478p.m10222a()
                l9.j r2 = p204l9.C4215j.m9454z(r2, r0)
                return r2
        }

        @Override // p093f9.AbstractC2089g.a
        /* renamed from: c */
        public void mo5522c(p221m9.InterfaceC4482q0 r3) {
                r2 = this;
                l9.j r3 = (p204l9.C4215j) r3
                int r0 = r3.m9455x()
                p236n9.C4717r.m10774a(r0)
                l9.k r0 = r3.m9456y()
                int r0 = r0.m9461y()
                r1 = 12
                if (r0 == r1) goto L2a
                l9.k r3 = r3.m9456y()
                int r3 = r3.m9461y()
                r0 = 16
                if (r3 != r0) goto L22
                goto L2a
            L22:
                java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
                java.lang.String r0 = "invalid IV size; acceptable values have 12 or 16 bytes"
                r3.<init>(r0)
                throw r3
            L2a:
                return
        }
    }

    public C2303e() {
            r4 = this;
            java.lang.Class<l9.i> r0 = p204l9.C4213i.class
            r1 = 1
            f9.g$b[] r1 = new p093f9.AbstractC2089g.b[r1]
            g9.e$a r2 = new g9.e$a
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
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesEaxKey"
            return r0
    }

    @Override // p093f9.AbstractC2089g
    /* renamed from: c */
    public p093f9.AbstractC2089g.a<p204l9.C4215j, p204l9.C4213i> mo5516c() {
            r2 = this;
            g9.e$b r0 = new g9.e$b
            java.lang.Class<l9.j> r1 = p204l9.C4215j.class
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
            l9.i r2 = p204l9.C4213i.m9438E(r2, r0)
            return r2
    }

    @Override // p093f9.AbstractC2089g
    /* renamed from: f */
    public void mo5519f(p221m9.InterfaceC4482q0 r3) {
            r2 = this;
            l9.i r3 = (p204l9.C4213i) r3
            int r0 = r3.m9445C()
            r1 = 0
            p236n9.C4717r.m10776c(r0, r1)
            m9.h r0 = r3.m9443A()
            int r0 = r0.size()
            p236n9.C4717r.m10774a(r0)
            l9.k r0 = r3.m9444B()
            int r0 = r0.m9461y()
            r1 = 12
            if (r0 == r1) goto L36
            l9.k r3 = r3.m9444B()
            int r3 = r3.m9461y()
            r0 = 16
            if (r3 != r0) goto L2e
            goto L36
        L2e:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "invalid IV size; acceptable values have 12 or 16 bytes"
            r3.<init>(r0)
            throw r3
        L36:
            return
    }
}
