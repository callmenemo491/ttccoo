package za;

@com.google.auto.value.AutoValue
/* renamed from: za.d */
/* loaded from: classes.dex */
public abstract class AbstractC7268d {

    /* renamed from: a */
    public static final /* synthetic */ int f27899a = 0;

    @com.google.auto.value.AutoValue.Builder
    /* renamed from: za.d$a */
    public static abstract class a {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public abstract za.AbstractC7268d mo14350a();

        /* renamed from: b */
        public abstract za.AbstractC7268d.a mo14351b(za.C7267c.a r1);
    }

    static {
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            if (r0 != 0) goto Lb
            java.lang.String r1 = " expiresInSecs"
            goto Ld
        Lb:
            java.lang.String r1 = ""
        Ld:
            if (r0 != 0) goto L15
            java.lang.String r2 = " tokenCreationEpochInSecs"
            java.lang.String r1 = p064e.C1493g.m4049a(r1, r2)
        L15:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L22
            r0.longValue()
            r0.longValue()
            return
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Missing required properties:"
            java.lang.String r1 = p064e.C1493g.m4049a(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    public AbstractC7268d() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract java.lang.String mo14342a();

    /* renamed from: b */
    public abstract long mo14343b();

    /* renamed from: c */
    public abstract java.lang.String mo14344c();

    /* renamed from: d */
    public abstract java.lang.String mo14345d();

    /* renamed from: e */
    public abstract java.lang.String mo14346e();

    /* renamed from: f */
    public abstract za.C7267c.a mo14347f();

    /* renamed from: g */
    public abstract long mo14348g();

    /* renamed from: h */
    public boolean m14357h() {
            r2 = this;
            za.c$a r0 = r2.mo14347f()
            za.c$a r1 = za.C7267c.a.f27897c0
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    /* renamed from: i */
    public boolean m14358i() {
            r2 = this;
            r0 = r2
            za.a r0 = (za.C7265a) r0
            za.c$a r0 = r0.f27875c
            za.c$a r1 = za.C7267c.a.f27894Z
            if (r0 == r1) goto L10
            za.c$a r1 = za.C7267c.a.f27893Y
            if (r0 != r1) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            return r0
    }

    /* renamed from: j */
    public boolean m14359j() {
            r2 = this;
            za.c$a r0 = r2.mo14347f()
            za.c$a r1 = za.C7267c.a.f27896b0
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    /* renamed from: k */
    public abstract za.AbstractC7268d.a mo14349k();
}
