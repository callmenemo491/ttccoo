package p397wg;

/* renamed from: wg.c */
/* loaded from: classes.dex */
public final class C6882c extends p418xg.C7072c {

    /* renamed from: wg.c$a */
    public static final class a<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p418xg.C7071b f26697a;

        /* renamed from: b */
        public final /* synthetic */ java.lang.String f26698b;

        /* renamed from: c */
        public final /* synthetic */ p101fh.InterfaceC2172d f26699c;

        public a(p418xg.C7071b r1, java.lang.String r2, p101fh.InterfaceC2172d r3) {
                r0 = this;
                r0.f26697a = r1
                r0.f26698b = r2
                r0.f26699c = r3
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r8) {
                r7 = this;
                r4 = r8
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r8 = "CallGetTableRows"
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                xg.b r1 = r7.f26697a
                java.lang.String r1 = r1.m14179c()
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                java.lang.String r1 = "requestBody: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r3 = r7.f26698b
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r8 = hk.C3053a.m7466a(r8)
                java.lang.String r0 = "response: "
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r4)
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r8.mo7467a(r0, r1)
                fh.d r6 = r7.f26699c
                xg.b r2 = r7.f26697a
                jb.j r3 = r2.f27393b
                java.lang.String r1 = "response"
                java.lang.Class<nf.g> r5 = nf.C4805g.class
                r0 = r4
                p397wg.C6881b.m13928a(r0, r1, r2, r3, r4, r5, r6)
                return
        }
    }

    /* renamed from: wg.c$a0 */
    public static final class a0<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p418xg.C7071b f26700a;

        /* renamed from: b */
        public final /* synthetic */ java.lang.String f26701b;

        /* renamed from: c */
        public final /* synthetic */ p101fh.InterfaceC2172d f26702c;

        public a0(p418xg.C7071b r1, java.lang.String r2, p101fh.InterfaceC2172d r3) {
                r0 = this;
                r0.f26700a = r1
                r0.f26701b = r2
                r0.f26702c = r3
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r8) {
                r7 = this;
                r4 = r8
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r8 = "CallGetTableRows"
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                xg.b r1 = r7.f26700a
                java.lang.String r1 = r1.m14179c()
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                java.lang.String r1 = "requestBody: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r3 = r7.f26701b
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r8 = hk.C3053a.m7466a(r8)
                java.lang.String r0 = "response: "
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r4)
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r8.mo7467a(r0, r1)
                fh.d r6 = r7.f26702c
                xg.b r2 = r7.f26700a
                jb.j r3 = r2.f27393b
                java.lang.String r1 = "response"
                java.lang.Class<nf.q> r5 = nf.C4815q.class
                r0 = r4
                p397wg.C6881b.m13928a(r0, r1, r2, r3, r4, r5, r6)
                return
        }
    }

    /* renamed from: wg.c$b */
    public static final class b extends p119h2.C2448j {

        /* renamed from: p0 */
        public final /* synthetic */ java.lang.String f26703p0;

        public b(java.lang.String r1, java.lang.String r2, p397wg.C6882c.a r3, p418xg.C7070a r4) {
                r0 = this;
                r0.f26703p0 = r1
                r1 = 1
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: l */
        public byte[] mo116l() {
                r2 = this;
                java.lang.String r0 = r2.f26703p0
                java.lang.String r1 = "requestBody"
                p214m2.C4339q.m9705j(r0, r1)
                java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
                byte[] r0 = r0.getBytes(r1)
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: wg.c$b0 */
    public static final class b0 extends p119h2.C2448j {

        /* renamed from: p0 */
        public final /* synthetic */ java.lang.String f26704p0;

        public b0(java.lang.String r1, java.lang.String r2, p397wg.C6882c.a0 r3, p418xg.C7070a r4) {
                r0 = this;
                r0.f26704p0 = r1
                r1 = 1
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: l */
        public byte[] mo116l() {
                r2 = this;
                java.lang.String r0 = r2.f26704p0
                java.lang.String r1 = "requestBody"
                p214m2.C4339q.m9705j(r0, r1)
                java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
                byte[] r0 = r0.getBytes(r1)
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: wg.c$c */
    public static final class c<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p418xg.C7071b f26705a;

        /* renamed from: b */
        public final /* synthetic */ java.lang.String f26706b;

        /* renamed from: c */
        public final /* synthetic */ p101fh.InterfaceC2172d f26707c;

        public c(p418xg.C7071b r1, java.lang.String r2, p101fh.InterfaceC2172d r3) {
                r0 = this;
                r0.f26705a = r1
                r0.f26706b = r2
                r0.f26707c = r3
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r8) {
                r7 = this;
                r4 = r8
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r8 = "CallGetTableRows"
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                xg.b r1 = r7.f26705a
                java.lang.String r1 = r1.m14179c()
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                java.lang.String r1 = "requestBody: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r3 = r7.f26706b
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r8 = hk.C3053a.m7466a(r8)
                java.lang.String r0 = "response: "
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r4)
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r8.mo7467a(r0, r1)
                fh.d r6 = r7.f26707c
                xg.b r2 = r7.f26705a
                jb.j r3 = r2.f27393b
                java.lang.String r1 = "response"
                java.lang.Class<nf.i> r5 = nf.C4807i.class
                r0 = r4
                p397wg.C6881b.m13928a(r0, r1, r2, r3, r4, r5, r6)
                return
        }
    }

    /* renamed from: wg.c$c0 */
    public static final class c0<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p418xg.C7071b f26708a;

        /* renamed from: b */
        public final /* synthetic */ java.lang.String f26709b;

        /* renamed from: c */
        public final /* synthetic */ p101fh.InterfaceC2172d f26710c;

        public c0(p418xg.C7071b r1, java.lang.String r2, p101fh.InterfaceC2172d r3) {
                r0 = this;
                r0.f26708a = r1
                r0.f26709b = r2
                r0.f26710c = r3
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r8) {
                r7 = this;
                r4 = r8
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r8 = "CallGetTableRows"
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                xg.b r1 = r7.f26708a
                java.lang.String r1 = r1.m14179c()
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                java.lang.String r1 = "requestBody: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r3 = r7.f26709b
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r8 = hk.C3053a.m7466a(r8)
                java.lang.String r0 = "response: "
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r4)
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r8.mo7467a(r0, r1)
                fh.d r6 = r7.f26710c
                xg.b r2 = r7.f26708a
                jb.j r3 = r2.f27393b
                java.lang.String r1 = "response"
                java.lang.Class<nf.r> r5 = nf.C4816r.class
                r0 = r4
                p397wg.C6881b.m13928a(r0, r1, r2, r3, r4, r5, r6)
                return
        }
    }

    /* renamed from: wg.c$d */
    public static final class d extends p119h2.C2448j {

        /* renamed from: p0 */
        public final /* synthetic */ java.lang.String f26711p0;

        public d(java.lang.String r1, java.lang.String r2, p397wg.C6882c.c r3, p418xg.C7070a r4) {
                r0 = this;
                r0.f26711p0 = r1
                r1 = 1
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: l */
        public byte[] mo116l() {
                r2 = this;
                java.lang.String r0 = r2.f26711p0
                java.lang.String r1 = "requestBody"
                p214m2.C4339q.m9705j(r0, r1)
                java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
                byte[] r0 = r0.getBytes(r1)
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: wg.c$d0 */
    public static final class d0 extends p119h2.C2448j {

        /* renamed from: p0 */
        public final /* synthetic */ java.lang.String f26712p0;

        public d0(java.lang.String r1, java.lang.String r2, p397wg.C6882c.c0 r3, p418xg.C7070a r4) {
                r0 = this;
                r0.f26712p0 = r1
                r1 = 1
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: l */
        public byte[] mo116l() {
                r2 = this;
                java.lang.String r0 = r2.f26712p0
                java.lang.String r1 = "requestBody"
                p214m2.C4339q.m9705j(r0, r1)
                java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
                byte[] r0 = r0.getBytes(r1)
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: wg.c$e */
    public static final class e<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p418xg.C7071b f26713a;

        /* renamed from: b */
        public final /* synthetic */ java.lang.String f26714b;

        /* renamed from: c */
        public final /* synthetic */ p101fh.InterfaceC2172d f26715c;

        public e(p418xg.C7071b r1, java.lang.String r2, p101fh.InterfaceC2172d r3) {
                r0 = this;
                r0.f26713a = r1
                r0.f26714b = r2
                r0.f26715c = r3
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r8) {
                r7 = this;
                r4 = r8
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r8 = "CallGetTableRows"
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                xg.b r1 = r7.f26713a
                java.lang.String r1 = r1.m14179c()
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                java.lang.String r1 = "requestBody: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r3 = r7.f26714b
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r8 = hk.C3053a.m7466a(r8)
                java.lang.String r0 = "response: "
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r4)
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r8.mo7467a(r0, r1)
                fh.d r6 = r7.f26715c
                xg.b r2 = r7.f26713a
                jb.j r3 = r2.f27393b
                java.lang.String r1 = "response"
                java.lang.Class<nf.j> r5 = nf.C4808j.class
                r0 = r4
                p397wg.C6881b.m13928a(r0, r1, r2, r3, r4, r5, r6)
                return
        }
    }

    /* renamed from: wg.c$e0 */
    public static final class e0<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p418xg.C7071b f26716a;

        /* renamed from: b */
        public final /* synthetic */ java.lang.String f26717b;

        /* renamed from: c */
        public final /* synthetic */ p101fh.InterfaceC2172d f26718c;

        public e0(p418xg.C7071b r1, java.lang.String r2, p101fh.InterfaceC2172d r3) {
                r0 = this;
                r0.f26716a = r1
                r0.f26717b = r2
                r0.f26718c = r3
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r8) {
                r7 = this;
                r4 = r8
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r8 = "CallGetTableRows"
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                xg.b r1 = r7.f26716a
                java.lang.String r1 = r1.m14179c()
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                java.lang.String r1 = "requestBody: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r3 = r7.f26717b
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r8 = hk.C3053a.m7466a(r8)
                java.lang.String r0 = "response: "
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r4)
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r8.mo7467a(r0, r1)
                fh.d r6 = r7.f26718c
                xg.b r2 = r7.f26716a
                jb.j r3 = r2.f27393b
                java.lang.String r1 = "response"
                java.lang.Class<nf.s> r5 = nf.C4817s.class
                r0 = r4
                p397wg.C6881b.m13928a(r0, r1, r2, r3, r4, r5, r6)
                return
        }
    }

    /* renamed from: wg.c$f */
    public static final class f extends p119h2.C2448j {

        /* renamed from: p0 */
        public final /* synthetic */ java.lang.String f26719p0;

        public f(java.lang.String r1, java.lang.String r2, p397wg.C6882c.e r3, p418xg.C7070a r4) {
                r0 = this;
                r0.f26719p0 = r1
                r1 = 1
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: l */
        public byte[] mo116l() {
                r2 = this;
                java.lang.String r0 = r2.f26719p0
                java.lang.String r1 = "requestBody"
                p214m2.C4339q.m9705j(r0, r1)
                java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
                byte[] r0 = r0.getBytes(r1)
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: wg.c$f0 */
    public static final class f0 extends p119h2.C2448j {

        /* renamed from: p0 */
        public final /* synthetic */ java.lang.String f26720p0;

        public f0(java.lang.String r1, java.lang.String r2, p397wg.C6882c.e0 r3, p418xg.C7070a r4) {
                r0 = this;
                r0.f26720p0 = r1
                r1 = 1
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: l */
        public byte[] mo116l() {
                r2 = this;
                java.lang.String r0 = r2.f26720p0
                java.lang.String r1 = "requestBody"
                p214m2.C4339q.m9705j(r0, r1)
                java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
                byte[] r0 = r0.getBytes(r1)
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: wg.c$g */
    public static final class g<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p418xg.C7071b f26721a;

        /* renamed from: b */
        public final /* synthetic */ java.lang.String f26722b;

        /* renamed from: c */
        public final /* synthetic */ p101fh.InterfaceC2172d f26723c;

        public g(p418xg.C7071b r1, java.lang.String r2, p101fh.InterfaceC2172d r3) {
                r0 = this;
                r0.f26721a = r1
                r0.f26722b = r2
                r0.f26723c = r3
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r8) {
                r7 = this;
                r4 = r8
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r8 = "CallGetTableRows"
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                xg.b r1 = r7.f26721a
                java.lang.String r1 = r1.m14179c()
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                java.lang.String r1 = "requestBody: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r3 = r7.f26722b
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r8 = hk.C3053a.m7466a(r8)
                java.lang.String r0 = "response: "
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r4)
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r8.mo7467a(r0, r1)
                fh.d r6 = r7.f26723c
                xg.b r2 = r7.f26721a
                jb.j r3 = r2.f27393b
                java.lang.String r1 = "response"
                java.lang.Class<nf.f> r5 = nf.C4804f.class
                r0 = r4
                p397wg.C6881b.m13928a(r0, r1, r2, r3, r4, r5, r6)
                return
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.utils.chain.FarmingGamesService", m7452f = "FarmingGamesService.kt", m7453l = {167}, m7454m = "getUser")
    /* renamed from: wg.c$g0 */
    public static final class g0 extends p134hh.AbstractC3042c {

        /* renamed from: b0 */
        public java.lang.Object f26724b0;

        /* renamed from: c0 */
        public java.lang.Object f26725c0;

        /* renamed from: d0 */
        public java.lang.Object f26726d0;

        /* renamed from: e0 */
        public java.lang.Object f26727e0;

        /* renamed from: f0 */
        public java.lang.Object f26728f0;

        /* renamed from: g0 */
        public java.lang.Object f26729g0;

        /* renamed from: h0 */
        public /* synthetic */ java.lang.Object f26730h0;

        /* renamed from: i0 */
        public final /* synthetic */ p397wg.C6882c f26731i0;

        /* renamed from: j0 */
        public int f26732j0;

        public g0(p397wg.C6882c r1, p101fh.InterfaceC2172d<? super p397wg.C6882c.g0> r2) {
                r0 = this;
                r0.f26731i0 = r1
                r0.<init>(r2)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r2) {
                r1 = this;
                r1.f26730h0 = r2
                int r2 = r1.f26732j0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f26732j0 = r2
                wg.c r2 = r1.f26731i0
                java.lang.Object r2 = r2.m13944t(r1)
                return r2
        }
    }

    /* renamed from: wg.c$h */
    public static final class h extends p119h2.C2448j {

        /* renamed from: p0 */
        public final /* synthetic */ java.lang.String f26733p0;

        public h(java.lang.String r1, java.lang.String r2, p397wg.C6882c.g r3, p418xg.C7070a r4) {
                r0 = this;
                r0.f26733p0 = r1
                r1 = 1
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: l */
        public byte[] mo116l() {
                r2 = this;
                java.lang.String r0 = r2.f26733p0
                java.lang.String r1 = "requestBody"
                p214m2.C4339q.m9705j(r0, r1)
                java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
                byte[] r0 = r0.getBytes(r1)
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: wg.c$h0 */
    public static final class h0<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p418xg.C7071b f26734a;

        /* renamed from: b */
        public final /* synthetic */ java.lang.String f26735b;

        /* renamed from: c */
        public final /* synthetic */ p101fh.InterfaceC2172d f26736c;

        public h0(p418xg.C7071b r1, java.lang.String r2, p101fh.InterfaceC2172d r3) {
                r0 = this;
                r0.f26734a = r1
                r0.f26735b = r2
                r0.f26736c = r3
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r8) {
                r7 = this;
                r4 = r8
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r8 = "CallGetTableRows"
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                xg.b r1 = r7.f26734a
                java.lang.String r1 = r1.m14179c()
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                java.lang.String r1 = "requestBody: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r3 = r7.f26735b
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r8 = hk.C3053a.m7466a(r8)
                java.lang.String r0 = "response: "
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r4)
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r8.mo7467a(r0, r1)
                fh.d r6 = r7.f26736c
                xg.b r2 = r7.f26734a
                jb.j r3 = r2.f27393b
                java.lang.String r1 = "response"
                java.lang.Class<nf.t> r5 = nf.C4818t.class
                r0 = r4
                p397wg.C6881b.m13928a(r0, r1, r2, r3, r4, r5, r6)
                return
        }
    }

    /* renamed from: wg.c$i */
    public static final class i<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p418xg.C7071b f26737a;

        /* renamed from: b */
        public final /* synthetic */ java.lang.String f26738b;

        /* renamed from: c */
        public final /* synthetic */ p101fh.InterfaceC2172d f26739c;

        public i(p418xg.C7071b r1, java.lang.String r2, p101fh.InterfaceC2172d r3) {
                r0 = this;
                r0.f26737a = r1
                r0.f26738b = r2
                r0.f26739c = r3
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r8) {
                r7 = this;
                r4 = r8
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r8 = "CallGetTableRows"
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                xg.b r1 = r7.f26737a
                java.lang.String r1 = r1.m14179c()
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                java.lang.String r1 = "requestBody: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r3 = r7.f26738b
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r8 = hk.C3053a.m7466a(r8)
                java.lang.String r0 = "response: "
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r4)
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r8.mo7467a(r0, r1)
                fh.d r6 = r7.f26739c
                xg.b r2 = r7.f26737a
                jb.j r3 = r2.f27393b
                java.lang.String r1 = "response"
                java.lang.Class<nf.p> r5 = nf.C4814p.class
                r0 = r4
                p397wg.C6881b.m13928a(r0, r1, r2, r3, r4, r5, r6)
                return
        }
    }

    /* renamed from: wg.c$i0 */
    public static final class i0 extends p119h2.C2448j {

        /* renamed from: p0 */
        public final /* synthetic */ java.lang.String f26740p0;

        public i0(java.lang.String r1, java.lang.String r2, p397wg.C6882c.h0 r3, p418xg.C7070a r4) {
                r0 = this;
                r0.f26740p0 = r1
                r1 = 1
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: l */
        public byte[] mo116l() {
                r2 = this;
                java.lang.String r0 = r2.f26740p0
                java.lang.String r1 = "requestBody"
                p214m2.C4339q.m9705j(r0, r1)
                java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
                byte[] r0 = r0.getBytes(r1)
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: wg.c$j */
    public static final class j extends p119h2.C2448j {

        /* renamed from: p0 */
        public final /* synthetic */ java.lang.String f26741p0;

        public j(java.lang.String r1, java.lang.String r2, p397wg.C6882c.i r3, p418xg.C7070a r4) {
                r0 = this;
                r0.f26741p0 = r1
                r1 = 1
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: l */
        public byte[] mo116l() {
                r2 = this;
                java.lang.String r0 = r2.f26741p0
                java.lang.String r1 = "requestBody"
                p214m2.C4339q.m9705j(r0, r1)
                java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
                byte[] r0 = r0.getBytes(r1)
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: wg.c$k */
    public static final class k<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p418xg.C7071b f26742a;

        /* renamed from: b */
        public final /* synthetic */ java.lang.String f26743b;

        /* renamed from: c */
        public final /* synthetic */ p101fh.InterfaceC2172d f26744c;

        public k(p418xg.C7071b r1, java.lang.String r2, p101fh.InterfaceC2172d r3) {
                r0 = this;
                r0.f26742a = r1
                r0.f26743b = r2
                r0.f26744c = r3
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r8) {
                r7 = this;
                r4 = r8
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r8 = "CallGetTableRows"
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                xg.b r1 = r7.f26742a
                java.lang.String r1 = r1.m14179c()
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                java.lang.String r1 = "requestBody: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r3 = r7.f26743b
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r8 = hk.C3053a.m7466a(r8)
                java.lang.String r0 = "response: "
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r4)
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r8.mo7467a(r0, r1)
                fh.d r6 = r7.f26744c
                xg.b r2 = r7.f26742a
                jb.j r3 = r2.f27393b
                java.lang.String r1 = "response"
                java.lang.Class<nf.k> r5 = nf.C4809k.class
                r0 = r4
                p397wg.C6881b.m13928a(r0, r1, r2, r3, r4, r5, r6)
                return
        }
    }

    /* renamed from: wg.c$l */
    public static final class l extends p119h2.C2448j {

        /* renamed from: p0 */
        public final /* synthetic */ java.lang.String f26745p0;

        public l(java.lang.String r1, java.lang.String r2, p397wg.C6882c.k r3, p418xg.C7070a r4) {
                r0 = this;
                r0.f26745p0 = r1
                r1 = 1
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: l */
        public byte[] mo116l() {
                r2 = this;
                java.lang.String r0 = r2.f26745p0
                java.lang.String r1 = "requestBody"
                p214m2.C4339q.m9705j(r0, r1)
                java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
                byte[] r0 = r0.getBytes(r1)
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: wg.c$m */
    public static final class m<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p418xg.C7071b f26746a;

        /* renamed from: b */
        public final /* synthetic */ java.lang.String f26747b;

        /* renamed from: c */
        public final /* synthetic */ p101fh.InterfaceC2172d f26748c;

        public m(p418xg.C7071b r1, java.lang.String r2, p101fh.InterfaceC2172d r3) {
                r0 = this;
                r0.f26746a = r1
                r0.f26747b = r2
                r0.f26748c = r3
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r8) {
                r7 = this;
                r4 = r8
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r8 = "CallGetTableRows"
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                xg.b r1 = r7.f26746a
                java.lang.String r1 = r1.m14179c()
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                java.lang.String r1 = "requestBody: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r3 = r7.f26747b
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r8 = hk.C3053a.m7466a(r8)
                java.lang.String r0 = "response: "
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r4)
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r8.mo7467a(r0, r1)
                fh.d r6 = r7.f26748c
                xg.b r2 = r7.f26746a
                jb.j r3 = r2.f27393b
                java.lang.String r1 = "response"
                java.lang.Class<nf.l> r5 = nf.C4810l.class
                r0 = r4
                p397wg.C6881b.m13928a(r0, r1, r2, r3, r4, r5, r6)
                return
        }
    }

    /* renamed from: wg.c$n */
    public static final class n extends p119h2.C2448j {

        /* renamed from: p0 */
        public final /* synthetic */ java.lang.String f26749p0;

        public n(java.lang.String r1, java.lang.String r2, p397wg.C6882c.m r3, p418xg.C7070a r4) {
                r0 = this;
                r0.f26749p0 = r1
                r1 = 1
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: l */
        public byte[] mo116l() {
                r2 = this;
                java.lang.String r0 = r2.f26749p0
                java.lang.String r1 = "requestBody"
                p214m2.C4339q.m9705j(r0, r1)
                java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
                byte[] r0 = r0.getBytes(r1)
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: wg.c$o */
    public static final class o<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p418xg.C7071b f26750a;

        /* renamed from: b */
        public final /* synthetic */ java.lang.String f26751b;

        /* renamed from: c */
        public final /* synthetic */ p101fh.InterfaceC2172d f26752c;

        public o(p418xg.C7071b r1, java.lang.String r2, p101fh.InterfaceC2172d r3) {
                r0 = this;
                r0.f26750a = r1
                r0.f26751b = r2
                r0.f26752c = r3
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r8) {
                r7 = this;
                r4 = r8
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r8 = "CallGetTableRows"
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                xg.b r1 = r7.f26750a
                java.lang.String r1 = r1.m14179c()
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                java.lang.String r1 = "requestBody: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r3 = r7.f26751b
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r8 = hk.C3053a.m7466a(r8)
                java.lang.String r0 = "response: "
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r4)
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r8.mo7467a(r0, r1)
                fh.d r6 = r7.f26752c
                xg.b r2 = r7.f26750a
                jb.j r3 = r2.f27393b
                java.lang.String r1 = "response"
                java.lang.Class<nf.a> r5 = nf.C4799a.class
                r0 = r4
                p397wg.C6881b.m13928a(r0, r1, r2, r3, r4, r5, r6)
                return
        }
    }

    /* renamed from: wg.c$p */
    public static final class p extends p119h2.C2448j {

        /* renamed from: p0 */
        public final /* synthetic */ java.lang.String f26753p0;

        public p(java.lang.String r1, java.lang.String r2, p397wg.C6882c.o r3, p418xg.C7070a r4) {
                r0 = this;
                r0.f26753p0 = r1
                r1 = 1
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: l */
        public byte[] mo116l() {
                r2 = this;
                java.lang.String r0 = r2.f26753p0
                java.lang.String r1 = "requestBody"
                p214m2.C4339q.m9705j(r0, r1)
                java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
                byte[] r0 = r0.getBytes(r1)
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: wg.c$q */
    public static final class q<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p418xg.C7071b f26754a;

        /* renamed from: b */
        public final /* synthetic */ java.lang.String f26755b;

        /* renamed from: c */
        public final /* synthetic */ p101fh.InterfaceC2172d f26756c;

        public q(p418xg.C7071b r1, java.lang.String r2, p101fh.InterfaceC2172d r3) {
                r0 = this;
                r0.f26754a = r1
                r0.f26755b = r2
                r0.f26756c = r3
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r8) {
                r7 = this;
                r4 = r8
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r8 = "CallGetTableRows"
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                xg.b r1 = r7.f26754a
                java.lang.String r1 = r1.m14179c()
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                java.lang.String r1 = "requestBody: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r3 = r7.f26755b
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r8 = hk.C3053a.m7466a(r8)
                java.lang.String r0 = "response: "
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r4)
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r8.mo7467a(r0, r1)
                fh.d r6 = r7.f26756c
                xg.b r2 = r7.f26754a
                jb.j r3 = r2.f27393b
                java.lang.String r1 = "response"
                java.lang.Class<nf.e> r5 = nf.C4803e.class
                r0 = r4
                p397wg.C6881b.m13928a(r0, r1, r2, r3, r4, r5, r6)
                return
        }
    }

    /* renamed from: wg.c$r */
    public static final class r extends p119h2.C2448j {

        /* renamed from: p0 */
        public final /* synthetic */ java.lang.String f26757p0;

        public r(java.lang.String r1, java.lang.String r2, p397wg.C6882c.q r3, p418xg.C7070a r4) {
                r0 = this;
                r0.f26757p0 = r1
                r1 = 1
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: l */
        public byte[] mo116l() {
                r2 = this;
                java.lang.String r0 = r2.f26757p0
                java.lang.String r1 = "requestBody"
                p214m2.C4339q.m9705j(r0, r1)
                java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
                byte[] r0 = r0.getBytes(r1)
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: wg.c$s */
    public static final class s<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p418xg.C7071b f26758a;

        /* renamed from: b */
        public final /* synthetic */ java.lang.String f26759b;

        /* renamed from: c */
        public final /* synthetic */ p101fh.InterfaceC2172d f26760c;

        public s(p418xg.C7071b r1, java.lang.String r2, p101fh.InterfaceC2172d r3) {
                r0 = this;
                r0.f26758a = r1
                r0.f26759b = r2
                r0.f26760c = r3
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r8) {
                r7 = this;
                r4 = r8
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r8 = "CallGetTableRows"
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                xg.b r1 = r7.f26758a
                java.lang.String r1 = r1.m14179c()
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                java.lang.String r1 = "requestBody: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r3 = r7.f26759b
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r8 = hk.C3053a.m7466a(r8)
                java.lang.String r0 = "response: "
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r4)
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r8.mo7467a(r0, r1)
                fh.d r6 = r7.f26760c
                xg.b r2 = r7.f26758a
                jb.j r3 = r2.f27393b
                java.lang.String r1 = "response"
                java.lang.Class<nf.d> r5 = nf.C4802d.class
                r0 = r4
                p397wg.C6881b.m13928a(r0, r1, r2, r3, r4, r5, r6)
                return
        }
    }

    /* renamed from: wg.c$t */
    public static final class t extends p119h2.C2448j {

        /* renamed from: p0 */
        public final /* synthetic */ java.lang.String f26761p0;

        public t(java.lang.String r1, java.lang.String r2, p397wg.C6882c.s r3, p418xg.C7070a r4) {
                r0 = this;
                r0.f26761p0 = r1
                r1 = 1
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: l */
        public byte[] mo116l() {
                r2 = this;
                java.lang.String r0 = r2.f26761p0
                java.lang.String r1 = "requestBody"
                p214m2.C4339q.m9705j(r0, r1)
                java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
                byte[] r0 = r0.getBytes(r1)
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: wg.c$u */
    public static final class u<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p418xg.C7071b f26762a;

        /* renamed from: b */
        public final /* synthetic */ java.lang.String f26763b;

        /* renamed from: c */
        public final /* synthetic */ p101fh.InterfaceC2172d f26764c;

        public u(p418xg.C7071b r1, java.lang.String r2, p101fh.InterfaceC2172d r3) {
                r0 = this;
                r0.f26762a = r1
                r0.f26763b = r2
                r0.f26764c = r3
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r8) {
                r7 = this;
                r4 = r8
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r8 = "CallGetTableRows"
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                xg.b r1 = r7.f26762a
                java.lang.String r1 = r1.m14179c()
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                java.lang.String r1 = "requestBody: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r3 = r7.f26763b
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r8 = hk.C3053a.m7466a(r8)
                java.lang.String r0 = "response: "
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r4)
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r8.mo7467a(r0, r1)
                fh.d r6 = r7.f26764c
                xg.b r2 = r7.f26762a
                jb.j r3 = r2.f27393b
                java.lang.String r1 = "response"
                java.lang.Class<nf.n> r5 = nf.C4812n.class
                r0 = r4
                p397wg.C6881b.m13928a(r0, r1, r2, r3, r4, r5, r6)
                return
        }
    }

    /* renamed from: wg.c$v */
    public static final class v extends p119h2.C2448j {

        /* renamed from: p0 */
        public final /* synthetic */ java.lang.String f26765p0;

        public v(java.lang.String r1, java.lang.String r2, p397wg.C6882c.u r3, p418xg.C7070a r4) {
                r0 = this;
                r0.f26765p0 = r1
                r1 = 1
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: l */
        public byte[] mo116l() {
                r2 = this;
                java.lang.String r0 = r2.f26765p0
                java.lang.String r1 = "requestBody"
                p214m2.C4339q.m9705j(r0, r1)
                java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
                byte[] r0 = r0.getBytes(r1)
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: wg.c$w */
    public static final class w<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p418xg.C7071b f26766a;

        /* renamed from: b */
        public final /* synthetic */ java.lang.String f26767b;

        /* renamed from: c */
        public final /* synthetic */ p101fh.InterfaceC2172d f26768c;

        public w(p418xg.C7071b r1, java.lang.String r2, p101fh.InterfaceC2172d r3) {
                r0 = this;
                r0.f26766a = r1
                r0.f26767b = r2
                r0.f26768c = r3
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r8) {
                r7 = this;
                r4 = r8
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r8 = "CallGetTableRows"
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                xg.b r1 = r7.f26766a
                java.lang.String r1 = r1.m14179c()
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                java.lang.String r1 = "requestBody: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r3 = r7.f26767b
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r8 = hk.C3053a.m7466a(r8)
                java.lang.String r0 = "response: "
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r4)
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r8.mo7467a(r0, r1)
                fh.d r6 = r7.f26768c
                xg.b r2 = r7.f26766a
                jb.j r3 = r2.f27393b
                java.lang.String r1 = "response"
                java.lang.Class<nf.o> r5 = nf.C4813o.class
                r0 = r4
                p397wg.C6881b.m13928a(r0, r1, r2, r3, r4, r5, r6)
                return
        }
    }

    /* renamed from: wg.c$x */
    public static final class x extends p119h2.C2448j {

        /* renamed from: p0 */
        public final /* synthetic */ java.lang.String f26769p0;

        public x(java.lang.String r1, java.lang.String r2, p397wg.C6882c.w r3, p418xg.C7070a r4) {
                r0 = this;
                r0.f26769p0 = r1
                r1 = 1
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: l */
        public byte[] mo116l() {
                r2 = this;
                java.lang.String r0 = r2.f26769p0
                java.lang.String r1 = "requestBody"
                p214m2.C4339q.m9705j(r0, r1)
                java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
                byte[] r0 = r0.getBytes(r1)
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    /* renamed from: wg.c$y */
    public static final class y<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p418xg.C7071b f26770a;

        /* renamed from: b */
        public final /* synthetic */ java.lang.String f26771b;

        /* renamed from: c */
        public final /* synthetic */ p101fh.InterfaceC2172d f26772c;

        public y(p418xg.C7071b r1, java.lang.String r2, p101fh.InterfaceC2172d r3) {
                r0 = this;
                r0.f26770a = r1
                r0.f26771b = r2
                r0.f26772c = r3
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r8) {
                r7 = this;
                r4 = r8
                java.lang.String r4 = (java.lang.String) r4
                java.lang.String r8 = "CallGetTableRows"
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                xg.b r1 = r7.f26770a
                java.lang.String r1 = r1.m14179c()
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r0 = hk.C3053a.m7466a(r8)
                java.lang.String r1 = "requestBody: "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.String r3 = r7.f26771b
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r0.mo7467a(r1, r3)
                hk.a$b r8 = hk.C3053a.m7466a(r8)
                java.lang.String r0 = "response: "
                java.lang.String r0 = p064e.C1493g.m4049a(r0, r4)
                java.lang.Object[] r1 = new java.lang.Object[r2]
                r8.mo7467a(r0, r1)
                fh.d r6 = r7.f26772c
                xg.b r2 = r7.f26770a
                jb.j r3 = r2.f27393b
                java.lang.String r1 = "response"
                java.lang.Class<nf.m> r5 = nf.C4811m.class
                r0 = r4
                p397wg.C6881b.m13928a(r0, r1, r2, r3, r4, r5, r6)
                return
        }
    }

    /* renamed from: wg.c$z */
    public static final class z extends p119h2.C2448j {

        /* renamed from: p0 */
        public final /* synthetic */ java.lang.String f26773p0;

        public z(java.lang.String r1, java.lang.String r2, p397wg.C6882c.y r3, p418xg.C7070a r4) {
                r0 = this;
                r0.f26773p0 = r1
                r1 = 1
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: l */
        public byte[] mo116l() {
                r2 = this;
                java.lang.String r0 = r2.f26773p0
                java.lang.String r1 = "requestBody"
                p214m2.C4339q.m9705j(r0, r1)
                java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
                byte[] r0 = r0.getBytes(r1)
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    public C6882c(p105g2.C2221o r3, p238nd.C4728b0 r4) {
            r2 = this;
            java.lang.String r0 = "queue"
            p214m2.C4339q.m9706k(r3, r0)
            java.lang.String r0 = "eosManager"
            p214m2.C4339q.m9706k(r4, r0)
            r0 = 0
            r1 = 4
            r2.<init>(r3, r4, r0, r1)
            return
    }

    /* renamed from: e */
    public final java.lang.Object m13929e(p101fh.InterfaceC2172d<? super java.util.List<nf.C4805g>> r14) {
            r13 = this;
            fh.j r0 = new fh.j
            fh.d r14 = gh.C2390b.m6127q(r14)
            r0.<init>(r14)
            yg.a r14 = new yg.a
            java.lang.String r2 = "farminggames"
            java.lang.String r3 = "confflower"
            java.lang.String r4 = "farminggames"
            r5 = 0
            r6 = 1000(0x3e8, float:1.401E-42)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 8
            r12 = 0
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            jb.j r1 = r13.f27393b
            java.lang.String r14 = r1.m7935i(r14)
            java.lang.String r1 = r13.m14179c()
            wg.c$a r2 = new wg.c$a
            r2.<init>(r13, r14, r0)
            xg.a r3 = new xg.a
            r4 = 2
            r3.<init>(r14, r0, r4)
            wg.c$b r4 = new wg.c$b
            r4.<init>(r14, r1, r2, r3)
            g2.o r14 = r13.f27392a
            r14.m5814a(r4)
            java.lang.Object r14 = r0.m5741a()
            return r14
    }

    /* renamed from: f */
    public final java.lang.Object m13930f(p101fh.InterfaceC2172d<? super java.util.List<nf.C4807i>> r14) {
            r13 = this;
            fh.j r0 = new fh.j
            fh.d r14 = gh.C2390b.m6127q(r14)
            r0.<init>(r14)
            yg.a r14 = new yg.a
            java.lang.String r2 = "farminggames"
            java.lang.String r3 = "confanimal"
            java.lang.String r4 = "farminggames"
            r5 = 0
            r6 = 1000(0x3e8, float:1.401E-42)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 8
            r12 = 0
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            jb.j r1 = r13.f27393b
            java.lang.String r14 = r1.m7935i(r14)
            java.lang.String r1 = r13.m14179c()
            wg.c$c r2 = new wg.c$c
            r2.<init>(r13, r14, r0)
            xg.a r3 = new xg.a
            r4 = 2
            r3.<init>(r14, r0, r4)
            wg.c$d r4 = new wg.c$d
            r4.<init>(r14, r1, r2, r3)
            g2.o r14 = r13.f27392a
            r14.m5814a(r4)
            java.lang.Object r14 = r0.m5741a()
            return r14
    }

    /* renamed from: g */
    public final java.lang.Object m13931g(p101fh.InterfaceC2172d<? super java.util.List<nf.C4808j>> r14) {
            r13 = this;
            fh.j r0 = new fh.j
            fh.d r14 = gh.C2390b.m6127q(r14)
            r0.<init>(r14)
            yg.a r14 = new yg.a
            java.lang.String r2 = "farminggames"
            java.lang.String r3 = "confbuilding"
            java.lang.String r4 = "farminggames"
            r5 = 0
            r6 = 1000(0x3e8, float:1.401E-42)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 8
            r12 = 0
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            jb.j r1 = r13.f27393b
            java.lang.String r14 = r1.m7935i(r14)
            java.lang.String r1 = r13.m14179c()
            wg.c$e r2 = new wg.c$e
            r2.<init>(r13, r14, r0)
            xg.a r3 = new xg.a
            r4 = 2
            r3.<init>(r14, r0, r4)
            wg.c$f r4 = new wg.c$f
            r4.<init>(r14, r1, r2, r3)
            g2.o r14 = r13.f27392a
            r14.m5814a(r4)
            java.lang.Object r14 = r0.m5741a()
            return r14
    }

    /* renamed from: h */
    public final java.lang.Object m13932h(p101fh.InterfaceC2172d<? super java.util.List<nf.C4804f>> r14) {
            r13 = this;
            fh.j r0 = new fh.j
            fh.d r14 = gh.C2390b.m6127q(r14)
            r0.<init>(r14)
            yg.a r14 = new yg.a
            java.lang.String r2 = "farminggames"
            java.lang.String r3 = "confbuildout"
            java.lang.String r4 = "farminggames"
            r5 = 0
            r6 = 1000(0x3e8, float:1.401E-42)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 8
            r12 = 0
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            jb.j r1 = r13.f27393b
            java.lang.String r14 = r1.m7935i(r14)
            java.lang.String r1 = r13.m14179c()
            wg.c$g r2 = new wg.c$g
            r2.<init>(r13, r14, r0)
            xg.a r3 = new xg.a
            r4 = 2
            r3.<init>(r14, r0, r4)
            wg.c$h r4 = new wg.c$h
            r4.<init>(r14, r1, r2, r3)
            g2.o r14 = r13.f27392a
            r14.m5814a(r4)
            java.lang.Object r14 = r0.m5741a()
            return r14
    }

    /* renamed from: i */
    public final java.lang.Object m13933i(p101fh.InterfaceC2172d<? super java.util.List<nf.C4814p>> r14) {
            r13 = this;
            fh.j r0 = new fh.j
            fh.d r14 = gh.C2390b.m6127q(r14)
            r0.<init>(r14)
            yg.a r14 = new yg.a
            java.lang.String r2 = "farminggame2"
            java.lang.String r3 = "products"
            java.lang.String r4 = "farminggame2"
            r5 = 0
            r6 = 1000(0x3e8, float:1.401E-42)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 8
            r12 = 0
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            jb.j r1 = r13.f27393b
            java.lang.String r14 = r1.m7935i(r14)
            java.lang.String r1 = r13.m14179c()
            wg.c$i r2 = new wg.c$i
            r2.<init>(r13, r14, r0)
            xg.a r3 = new xg.a
            r4 = 2
            r3.<init>(r14, r0, r4)
            wg.c$j r4 = new wg.c$j
            r4.<init>(r14, r1, r2, r3)
            g2.o r14 = r13.f27392a
            r14.m5814a(r4)
            java.lang.Object r14 = r0.m5741a()
            return r14
    }

    /* renamed from: j */
    public final java.lang.Object m13934j(p101fh.InterfaceC2172d<? super java.util.List<nf.C4809k>> r14) {
            r13 = this;
            fh.j r0 = new fh.j
            fh.d r14 = gh.C2390b.m6127q(r14)
            r0.<init>(r14)
            yg.a r14 = new yg.a
            java.lang.String r2 = "farmingstake"
            java.lang.String r3 = "config"
            java.lang.String r4 = "farmingstake"
            r5 = 0
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 8
            r12 = 0
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            jb.j r1 = r13.f27393b
            java.lang.String r14 = r1.m7935i(r14)
            java.lang.String r1 = r13.m14179c()
            wg.c$k r2 = new wg.c$k
            r2.<init>(r13, r14, r0)
            xg.a r3 = new xg.a
            r4 = 2
            r3.<init>(r14, r0, r4)
            wg.c$l r4 = new wg.c$l
            r4.<init>(r14, r1, r2, r3)
            g2.o r14 = r13.f27392a
            r14.m5814a(r4)
            java.lang.Object r14 = r0.m5741a()
            return r14
    }

    /* renamed from: k */
    public final java.lang.Object m13935k(p101fh.InterfaceC2172d<? super java.util.List<nf.C4810l>> r14) {
            r13 = this;
            fh.j r0 = new fh.j
            fh.d r14 = gh.C2390b.m6127q(r14)
            r0.<init>(r14)
            yg.a r14 = new yg.a
            java.lang.String r2 = "farminggames"
            java.lang.String r3 = "confplant"
            java.lang.String r4 = "farminggames"
            r5 = 0
            r6 = 1000(0x3e8, float:1.401E-42)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 8
            r12 = 0
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            jb.j r1 = r13.f27393b
            java.lang.String r14 = r1.m7935i(r14)
            java.lang.String r1 = r13.m14179c()
            wg.c$m r2 = new wg.c$m
            r2.<init>(r13, r14, r0)
            xg.a r3 = new xg.a
            r4 = 2
            r3.<init>(r14, r0, r4)
            wg.c$n r4 = new wg.c$n
            r4.<init>(r14, r1, r2, r3)
            g2.o r14 = r13.f27392a
            r14.m5814a(r4)
            java.lang.Object r14 = r0.m5741a()
            return r14
    }

    /* renamed from: l */
    public final java.lang.Object m13936l(p101fh.InterfaceC2172d<? super java.util.List<nf.C4799a>> r15) {
            r14 = this;
            java.lang.String r6 = r14.m14180d()
            java.lang.String r7 = r14.m14180d()
            java.lang.Integer r8 = new java.lang.Integer
            r12 = 2
            r8.<init>(r12)
            fh.j r13 = new fh.j
            fh.d r15 = gh.C2390b.m6127q(r15)
            r13.<init>(r15)
            yg.a r15 = new yg.a
            java.lang.String r1 = "farminggames"
            java.lang.String r2 = "animal"
            java.lang.String r3 = "farminggames"
            r4 = 0
            r5 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r9 = "i64"
            r10 = 8
            r11 = 0
            r0 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            jb.j r0 = r14.f27393b
            java.lang.String r15 = r0.m7935i(r15)
            java.lang.String r0 = r14.m14179c()
            wg.c$o r1 = new wg.c$o
            r1.<init>(r14, r15, r13)
            xg.a r2 = new xg.a
            r2.<init>(r15, r13, r12)
            wg.c$p r3 = new wg.c$p
            r3.<init>(r15, r0, r1, r2)
            g2.o r15 = r14.f27392a
            r15.m5814a(r3)
            java.lang.Object r15 = r13.m5741a()
            return r15
    }

    /* renamed from: m */
    public final java.lang.Object m13937m(p101fh.InterfaceC2172d<? super java.util.List<nf.C4803e>> r15) {
            r14 = this;
            java.lang.String r6 = r14.m14180d()
            java.lang.String r7 = r14.m14180d()
            java.lang.Integer r8 = new java.lang.Integer
            r12 = 2
            r8.<init>(r12)
            fh.j r13 = new fh.j
            fh.d r15 = gh.C2390b.m6127q(r15)
            r13.<init>(r15)
            yg.a r15 = new yg.a
            java.lang.String r1 = "farminggames"
            java.lang.String r2 = "buildout"
            java.lang.String r3 = "farminggames"
            r4 = 0
            r5 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r9 = "i64"
            r10 = 8
            r11 = 0
            r0 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            jb.j r0 = r14.f27393b
            java.lang.String r15 = r0.m7935i(r15)
            java.lang.String r0 = r14.m14179c()
            wg.c$q r1 = new wg.c$q
            r1.<init>(r14, r15, r13)
            xg.a r2 = new xg.a
            r2.<init>(r15, r13, r12)
            wg.c$r r3 = new wg.c$r
            r3.<init>(r15, r0, r1, r2)
            g2.o r15 = r14.f27392a
            r15.m5814a(r3)
            java.lang.Object r15 = r13.m5741a()
            return r15
    }

    /* renamed from: n */
    public final java.lang.Object m13938n(p101fh.InterfaceC2172d<? super java.util.List<nf.C4802d>> r15) {
            r14 = this;
            java.lang.String r6 = r14.m14180d()
            java.lang.String r7 = r14.m14180d()
            java.lang.Integer r8 = new java.lang.Integer
            r12 = 2
            r8.<init>(r12)
            fh.j r13 = new fh.j
            fh.d r15 = gh.C2390b.m6127q(r15)
            r13.<init>(r15)
            yg.a r15 = new yg.a
            java.lang.String r1 = "farminggames"
            java.lang.String r2 = "building"
            java.lang.String r3 = "farminggames"
            r4 = 0
            r5 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r9 = "i64"
            r10 = 8
            r11 = 0
            r0 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            jb.j r0 = r14.f27393b
            java.lang.String r15 = r0.m7935i(r15)
            java.lang.String r0 = r14.m14179c()
            wg.c$s r1 = new wg.c$s
            r1.<init>(r14, r15, r13)
            xg.a r2 = new xg.a
            r2.<init>(r15, r13, r12)
            wg.c$t r3 = new wg.c$t
            r3.<init>(r15, r0, r1, r2)
            g2.o r15 = r14.f27392a
            r15.m5814a(r3)
            java.lang.Object r15 = r13.m5741a()
            return r15
    }

    /* renamed from: o */
    public final java.lang.Object m13939o(p101fh.InterfaceC2172d<? super java.util.List<nf.C4812n>> r15) {
            r14 = this;
            java.lang.String r6 = r14.m14180d()
            java.lang.String r7 = r14.m14180d()
            java.lang.Integer r8 = new java.lang.Integer
            r12 = 2
            r8.<init>(r12)
            fh.j r13 = new fh.j
            fh.d r15 = gh.C2390b.m6127q(r15)
            r13.<init>(r15)
            yg.a r15 = new yg.a
            java.lang.String r1 = "farminggames"
            java.lang.String r2 = "flower"
            java.lang.String r3 = "farminggames"
            r4 = 0
            r5 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r9 = "i64"
            r10 = 8
            r11 = 0
            r0 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            jb.j r0 = r14.f27393b
            java.lang.String r15 = r0.m7935i(r15)
            java.lang.String r0 = r14.m14179c()
            wg.c$u r1 = new wg.c$u
            r1.<init>(r14, r15, r13)
            xg.a r2 = new xg.a
            r2.<init>(r15, r13, r12)
            wg.c$v r3 = new wg.c$v
            r3.<init>(r15, r0, r1, r2)
            g2.o r15 = r14.f27392a
            r15.m5814a(r3)
            java.lang.Object r15 = r13.m5741a()
            return r15
    }

    /* renamed from: p */
    public final java.lang.Object m13940p(p101fh.InterfaceC2172d<? super java.util.List<nf.C4813o>> r15) {
            r14 = this;
            java.lang.String r6 = r14.m14180d()
            java.lang.String r7 = r14.m14180d()
            java.lang.Integer r8 = new java.lang.Integer
            r12 = 2
            r8.<init>(r12)
            fh.j r13 = new fh.j
            fh.d r15 = gh.C2390b.m6127q(r15)
            r13.<init>(r15)
            yg.a r15 = new yg.a
            java.lang.String r1 = "farminggames"
            java.lang.String r2 = "plant"
            java.lang.String r3 = "farminggames"
            r4 = 0
            r5 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r9 = "i64"
            r10 = 8
            r11 = 0
            r0 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            jb.j r0 = r14.f27393b
            java.lang.String r15 = r0.m7935i(r15)
            java.lang.String r0 = r14.m14179c()
            wg.c$w r1 = new wg.c$w
            r1.<init>(r14, r15, r13)
            xg.a r2 = new xg.a
            r2.<init>(r15, r13, r12)
            wg.c$x r3 = new wg.c$x
            r3.<init>(r15, r0, r1, r2)
            g2.o r15 = r14.f27392a
            r15.m5814a(r3)
            java.lang.Object r15 = r13.m5741a()
            return r15
    }

    /* renamed from: q */
    public final java.lang.Object m13941q(p101fh.InterfaceC2172d<? super java.util.List<nf.C4811m>> r14) {
            r13 = this;
            java.lang.String r6 = r13.m14180d()
            java.lang.String r7 = r13.m14180d()
            fh.j r12 = new fh.j
            fh.d r14 = gh.C2390b.m6127q(r14)
            r12.<init>(r14)
            yg.a r14 = new yg.a
            java.lang.String r1 = "farminggames"
            java.lang.String r2 = "resources"
            java.lang.String r3 = "farminggames"
            r4 = 0
            r5 = 1
            r8 = 0
            r9 = 0
            r10 = 8
            r11 = 0
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            jb.j r0 = r13.f27393b
            java.lang.String r14 = r0.m7935i(r14)
            java.lang.String r0 = r13.m14179c()
            wg.c$y r1 = new wg.c$y
            r1.<init>(r13, r14, r12)
            xg.a r2 = new xg.a
            r3 = 2
            r2.<init>(r14, r12, r3)
            wg.c$z r3 = new wg.c$z
            r3.<init>(r14, r0, r1, r2)
            g2.o r14 = r13.f27392a
            r14.m5814a(r3)
            java.lang.Object r14 = r12.m5741a()
            return r14
    }

    /* renamed from: r */
    public final java.lang.Object m13942r(p101fh.InterfaceC2172d<? super java.util.List<nf.C4815q>> r14) {
            r13 = this;
            java.lang.String r6 = r13.m14180d()
            java.lang.String r7 = r13.m14180d()
            fh.j r12 = new fh.j
            fh.d r14 = gh.C2390b.m6127q(r14)
            r12.<init>(r14)
            yg.a r14 = new yg.a
            java.lang.String r1 = "farmingstake"
            java.lang.String r2 = "staked"
            java.lang.String r3 = "farmingstake"
            r4 = 0
            r5 = 1
            r8 = 0
            r9 = 0
            r10 = 8
            r11 = 0
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            jb.j r0 = r13.f27393b
            java.lang.String r14 = r0.m7935i(r14)
            java.lang.String r0 = r13.m14179c()
            wg.c$a0 r1 = new wg.c$a0
            r1.<init>(r13, r14, r12)
            xg.a r2 = new xg.a
            r3 = 2
            r2.<init>(r14, r12, r3)
            wg.c$b0 r3 = new wg.c$b0
            r3.<init>(r14, r0, r1, r2)
            g2.o r14 = r13.f27392a
            r14.m5814a(r3)
            java.lang.Object r14 = r12.m5741a()
            return r14
    }

    /* renamed from: s */
    public final java.lang.Object m13943s(p101fh.InterfaceC2172d<? super java.util.List<nf.C4816r>> r14) {
            r13 = this;
            fh.j r0 = new fh.j
            fh.d r14 = gh.C2390b.m6127q(r14)
            r0.<init>(r14)
            yg.a r14 = new yg.a
            java.lang.String r2 = "farmingstake"
            java.lang.String r3 = "totstaked"
            java.lang.String r4 = "farmingstake"
            r5 = 0
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 8
            r12 = 0
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            jb.j r1 = r13.f27393b
            java.lang.String r14 = r1.m7935i(r14)
            java.lang.String r1 = r13.m14179c()
            wg.c$c0 r2 = new wg.c$c0
            r2.<init>(r13, r14, r0)
            xg.a r3 = new xg.a
            r4 = 2
            r3.<init>(r14, r0, r4)
            wg.c$d0 r4 = new wg.c$d0
            r4.<init>(r14, r1, r2, r3)
            g2.o r14 = r13.f27392a
            r14.m5814a(r4)
            java.lang.Object r14 = r0.m5741a()
            return r14
    }

    /* renamed from: t */
    public final java.lang.Object m13944t(p101fh.InterfaceC2172d<? super nf.C4817s> r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof p397wg.C6882c.g0
            if (r2 == 0) goto L17
            r2 = r1
            wg.c$g0 r2 = (p397wg.C6882c.g0) r2
            int r3 = r2.f26732j0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f26732j0 = r3
            goto L1c
        L17:
            wg.c$g0 r2 = new wg.c$g0
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f26730h0
            gh.a r3 = gh.EnumC2389a.f10764Y
            int r4 = r2.f26732j0
            r5 = 1
            if (r4 == 0) goto L4b
            if (r4 != r5) goto L43
            java.lang.Object r3 = r2.f26729g0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r2.f26728f0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r2.f26727e0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r2.f26726d0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = r2.f26725c0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.f26724b0
            wg.c r2 = (p397wg.C6882c) r2
            p074e9.C1805a.m4540y(r1)
            goto Lab
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L4b:
            p074e9.C1805a.m4540y(r1)
            java.lang.String r1 = "farminggame2"
            java.lang.String r7 = "farminggame2"
            java.lang.String r6 = "users"
            java.lang.String r10 = r17.m14180d()
            java.lang.String r11 = r17.m14180d()
            r12 = 0
            r2.f26724b0 = r0
            r2.f26725c0 = r1
            r2.f26726d0 = r7
            r2.f26727e0 = r6
            r2.f26728f0 = r10
            r2.f26729g0 = r11
            r2.f26732j0 = r5
            fh.j r15 = new fh.j
            fh.d r2 = gh.C2390b.m6127q(r2)
            r15.<init>(r2)
            yg.a r2 = new yg.a
            r8 = 0
            r13 = 0
            r14 = 8
            r16 = 0
            r9 = 1
            r4 = r2
            r5 = r1
            r1 = r15
            r15 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            jb.j r4 = r0.f27393b
            java.lang.String r2 = r4.m7935i(r2)
            java.lang.String r4 = r17.m14179c()
            wg.c$e0 r5 = new wg.c$e0
            r5.<init>(r0, r2, r1)
            xg.a r6 = new xg.a
            r7 = 2
            r6.<init>(r2, r1, r7)
            wg.c$f0 r7 = new wg.c$f0
            r7.<init>(r2, r4, r5, r6)
            g2.o r2 = r0.f27392a
            r2.m5814a(r7)
            java.lang.Object r1 = r1.m5741a()
            if (r1 != r3) goto Lab
            return r3
        Lab:
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = p062dh.C1473i.m3996H(r1)
            return r1
    }

    /* renamed from: u */
    public final java.lang.Object m13945u(p101fh.InterfaceC2172d<? super java.util.List<nf.C4818t>> r14) {
            r13 = this;
            java.lang.String r6 = r13.m14180d()
            java.lang.String r7 = r13.m14180d()
            fh.j r12 = new fh.j
            fh.d r14 = gh.C2390b.m6127q(r14)
            r12.<init>(r14)
            yg.a r14 = new yg.a
            java.lang.String r1 = "farminggames"
            java.lang.String r2 = "wallet"
            java.lang.String r3 = "farminggames"
            r4 = 0
            r5 = 1
            r8 = 0
            r9 = 0
            r10 = 8
            r11 = 0
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            jb.j r0 = r13.f27393b
            java.lang.String r14 = r0.m7935i(r14)
            java.lang.String r0 = r13.m14179c()
            wg.c$h0 r1 = new wg.c$h0
            r1.<init>(r13, r14, r12)
            xg.a r2 = new xg.a
            r3 = 2
            r2.<init>(r14, r12, r3)
            wg.c$i0 r3 = new wg.c$i0
            r3.<init>(r14, r0, r1, r2)
            g2.o r14 = r13.f27392a
            r14.m5814a(r3)
            java.lang.Object r14 = r12.m5741a()
            return r14
    }
}
