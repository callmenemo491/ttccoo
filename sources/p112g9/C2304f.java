package p112g9;

/* renamed from: g9.f */
/* loaded from: classes.dex */
public final class C2304f extends p093f9.AbstractC2089g<p204l9.C4218l> {

    /* renamed from: g9.f$a */
    public class a extends p093f9.AbstractC2089g.b<p093f9.InterfaceC2083a, p204l9.C4218l> {
        public a(java.lang.Class r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // p093f9.AbstractC2089g.b
        /* renamed from: a */
        public p093f9.InterfaceC2083a mo5523a(p204l9.C4218l r2) {
                r1 = this;
                l9.l r2 = (p204l9.C4218l) r2
                n9.d r0 = new n9.d
                m9.h r2 = r2.m9468z()
                byte[] r2 = r2.m10063w()
                r0.<init>(r2)
                return r0
        }
    }

    /* renamed from: g9.f$b */
    public class b extends p093f9.AbstractC2089g.a<p204l9.C4219m, p204l9.C4218l> {

        /* renamed from: b */
        public final /* synthetic */ p112g9.C2304f f10522b;

        public b(p112g9.C2304f r1, java.lang.Class r2) {
                r0 = this;
                r0.f10522b = r1
                r0.<init>(r2)
                return
        }

        @Override // p093f9.AbstractC2089g.a
        /* renamed from: a */
        public p204l9.C4218l mo5520a(p221m9.InterfaceC4482q0 r4) {
                r3 = this;
                l9.m r4 = (p204l9.C4219m) r4
                l9.l$b r0 = p204l9.C4218l.m9462B()
                int r4 = r4.m9473y()
                byte[] r4 = p236n9.C4716q.m10773a(r4)
                int r1 = r4.length
                r2 = 0
                m9.h r4 = p221m9.AbstractC4454h.m10054i(r4, r2, r1)
                r0.m10377o()
                MessageType extends m9.x<MessageType, BuilderType> r1 = r0.f18293Z
                l9.l r1 = (p204l9.C4218l) r1
                p204l9.C4218l.m9466y(r1, r4)
                g9.f r4 = r3.f10522b
                java.util.Objects.requireNonNull(r4)
                r0.m10377o()
                MessageType extends m9.x<MessageType, BuilderType> r4 = r0.f18293Z
                l9.l r4 = (p204l9.C4218l) r4
                p204l9.C4218l.m9465x(r4, r2)
                m9.x r4 = r0.m10375k()
                l9.l r4 = (p204l9.C4218l) r4
                return r4
        }

        @Override // p093f9.AbstractC2089g.a
        /* renamed from: b */
        public p221m9.InterfaceC4482q0 mo5521b(p221m9.AbstractC4454h r2) {
                r1 = this;
                m9.p r0 = p221m9.C4478p.m10222a()
                l9.m r2 = p204l9.C4219m.m9469A(r2, r0)
                return r2
        }

        @Override // p093f9.AbstractC2089g.a
        /* renamed from: c */
        public void mo5522c(p221m9.InterfaceC4482q0 r1) {
                r0 = this;
                l9.m r1 = (p204l9.C4219m) r1
                int r1 = r1.m9473y()
                p236n9.C4717r.m10774a(r1)
                return
        }
    }

    public C2304f() {
            r4 = this;
            java.lang.Class<l9.l> r0 = p204l9.C4218l.class
            r1 = 1
            f9.g$b[] r1 = new p093f9.AbstractC2089g.b[r1]
            g9.f$a r2 = new g9.f$a
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
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesGcmKey"
            return r0
    }

    @Override // p093f9.AbstractC2089g
    /* renamed from: c */
    public p093f9.AbstractC2089g.a<p204l9.C4219m, p204l9.C4218l> mo5516c() {
            r2 = this;
            g9.f$b r0 = new g9.f$b
            java.lang.Class<l9.m> r1 = p204l9.C4219m.class
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
            l9.l r2 = p204l9.C4218l.m9463C(r2, r0)
            return r2
    }

    @Override // p093f9.AbstractC2089g
    /* renamed from: f */
    public void mo5519f(p221m9.InterfaceC4482q0 r3) {
            r2 = this;
            l9.l r3 = (p204l9.C4218l) r3
            int r0 = r3.m9467A()
            r1 = 0
            p236n9.C4717r.m10776c(r0, r1)
            m9.h r3 = r3.m9468z()
            int r3 = r3.size()
            p236n9.C4717r.m10774a(r3)
            return
    }
}
