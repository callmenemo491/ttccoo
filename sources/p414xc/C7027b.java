package p414xc;

/* renamed from: xc.b */
/* loaded from: classes.dex */
public class C7027b implements p394wc.InterfaceC6831b {
    public static final java.lang.String VARIANT_TYPE = "action";
    private final java.lang.String ACCOUNT;
    private final java.lang.String AUTHORIZATION;
    private final java.lang.String DATA;
    private final java.lang.String NAME;
    private p414xc.C7026a gAccount;
    private java.util.List<p414xc.C7036k> gAuthorization;
    private p414xc.C7028c gData;
    private p414xc.C7029d gName;

    public C7027b() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "account"
            r1.ACCOUNT = r0
            java.lang.String r0 = "name"
            r1.NAME = r0
            java.lang.String r0 = "authorization"
            r1.AUTHORIZATION = r0
            java.lang.String r0 = "data"
            r1.DATA = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.gAuthorization = r0
            return
    }

    public C7027b(p169jb.C3476s r6) {
            r5 = this;
            r5.<init>()
            java.lang.String r0 = "account"
            r5.ACCOUNT = r0
            java.lang.String r1 = "name"
            r5.NAME = r1
            java.lang.String r2 = "authorization"
            r5.AUTHORIZATION = r2
            java.lang.String r3 = "data"
            r5.DATA = r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5.gAuthorization = r4
            xc.a r4 = new xc.a
            jb.p r0 = r6.m7949n(r0)
            java.lang.String r0 = r0.mo7944l()
            r4.<init>(r0)
            r5.gAccount = r4
            xc.d r0 = new xc.d
            jb.p r1 = r6.m7949n(r1)
            java.lang.String r1 = r1.mo7944l()
            r0.<init>(r1)
            r5.gName = r0
            jb.m r0 = r6.m7950p(r2)
            java.util.List r0 = r5.getPermissionsFromJsonArray(r0)
            r5.gAuthorization = r0
            jb.p r0 = r6.m7949n(r3)
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r0 instanceof p169jb.C3476s
            if (r0 == 0) goto L61
            xc.c r0 = new xc.c
            lb.r<java.lang.String, jb.p> r6 = r6.f14968a
            lb.r$e r6 = r6.m9560c(r3)
            if (r6 == 0) goto L5a
            V r6 = r6.f17456e0
            goto L5b
        L5a:
            r6 = 0
        L5b:
            jb.s r6 = (p169jb.C3476s) r6
            r0.<init>(r6)
            goto L6e
        L61:
            xc.c r0 = new xc.c
            jb.p r6 = r6.m7949n(r3)
            java.lang.String r6 = r6.mo7944l()
            r0.<init>(r6)
        L6e:
            r5.gData = r0
            return
    }

    private java.util.List<p414xc.C7036k> getPermissionsFromJsonArray(p169jb.C3470m r4) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r4.next()
            jb.p r1 = (p169jb.AbstractC3473p) r1
            boolean r2 = r1 instanceof p169jb.C3476s
            if (r2 == 0) goto L24
            xc.k r2 = new xc.k
            jb.s r1 = (p169jb.C3476s) r1
            r2.<init>(r1)
            r0.add(r2)
            goto L9
        L24:
            uc.a r4 = new uc.a
            java.lang.String r0 = "Permission was not an object"
            r4.<init>(r0)
            throw r4
        L2c:
            return r0
    }

    public void addAuthorization(p414xc.C7036k r2) {
            r1 = this;
            java.util.List<xc.k> r0 = r1.gAuthorization
            r0.add(r2)
            return
    }

    public p414xc.C7026a getAccount() {
            r1 = this;
            xc.a r0 = r1.gAccount
            return r0
    }

    public java.util.List<p414xc.C7036k> getAuthorization() {
            r1 = this;
            java.util.List<xc.k> r0 = r1.gAuthorization
            return r0
    }

    public java.lang.String getAuthorizationJSON() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<xc.k> r1 = r3.gAuthorization
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()
            xc.k r2 = (p414xc.C7036k) r2
            java.util.Map r2 = r2.toMap()
            r0.add(r2)
            goto Lb
        L1f:
            java.lang.String r0 = p435yc.C7155a.m14270c(r0)
            return r0
    }

    public p414xc.C7028c getData() {
            r1 = this;
            xc.c r0 = r1.gData
            return r0
    }

    public p414xc.C7029d getName() {
            r1 = this;
            xc.d r0 = r1.gName
            return r0
    }

    public java.util.List<p414xc.C7027b> getRawActions() {
            r7 = this;
            r0 = 1
            xc.b[] r1 = new p414xc.C7027b[r0]
            r2 = 0
            r1[r2] = r7
            java.lang.String r3 = "arraySize"
            p026b9.C0720t.m2328b(r0, r3)
            long r3 = (long) r0
            r5 = 5
            long r3 = r3 + r5
            long r5 = (long) r2
            long r3 = r3 + r5
            int r0 = p074e9.C1806b.m4543v(r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Collections.addAll(r2, r1)
            return r2
    }

    public boolean isIdentity() {
            r2 = this;
            xc.a r0 = r2.gAccount
            if (r0 == 0) goto L22
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = ""
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L22
            xc.d r0 = r2.gName
            if (r0 == 0) goto L22
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "identity"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            return r0
    }

    public void setAccount(p414xc.C7026a r1) {
            r0 = this;
            r0.gAccount = r1
            return
    }

    public void setData(p414xc.C7028c r1) {
            r0 = this;
            r0.gData = r1
            return
    }

    public void setName(p414xc.C7029d r1) {
            r0 = this;
            r0.gName = r1
            return
    }

    public java.util.Map<java.lang.String, java.lang.Object> toMap() {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            xc.a r1 = r4.gAccount
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "account"
            r0.put(r2, r1)
            xc.d r1 = r4.gName
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "name"
            r0.put(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List<xc.k> r2 = r4.gAuthorization
            java.util.Iterator r2 = r2.iterator()
        L26:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r2.next()
            xc.k r3 = (p414xc.C7036k) r3
            java.util.Map r3 = r3.toMap()
            r1.add(r3)
            goto L26
        L3a:
            java.lang.String r2 = "authorization"
            r0.put(r2, r1)
            xc.c r1 = r4.gData
            boolean r1 = r1.isPacked()
            if (r1 == 0) goto L4e
            xc.c r1 = r4.gData
            java.lang.String r1 = r1.getPackedData()
            goto L54
        L4e:
            xc.c r1 = r4.gData
            java.util.Map r1 = r1.getData()
        L54:
            java.lang.String r2 = "data"
            r0.put(r2, r1)
            return r0
    }

    @Override // p394wc.InterfaceC6831b
    public java.util.List<java.lang.Object> toVariant() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "action"
            r0.add(r1)
            java.util.Map r1 = r2.toMap()
            r0.add(r1)
            return r0
    }
}
