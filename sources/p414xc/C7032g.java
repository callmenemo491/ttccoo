package p414xc;

/* renamed from: xc.g */
/* loaded from: classes.dex */
public class C7032g {
    private static final java.lang.String ALIAS_LABEL = "chain_alias";
    public static final java.lang.String CHAIN_ID = "chain_id";
    private int gChainAlias;
    private java.lang.String gChainId;
    private java.lang.String gChainName;

    public C7032g(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.gChainId = r1
            r0.gChainAlias = r2
            r0.gChainName = r3
            return
    }

    public C7032g(p414xc.EnumC7031f r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.getId()
            r1.gChainId = r0
            int r0 = r2.getAlias()
            r1.gChainAlias = r0
            java.lang.String r2 = r2.name()
            java.lang.String r2 = r2.toLowerCase()
            r1.gChainName = r2
            return
    }

    public static p414xc.C7032g fromVariant(p169jb.C3470m r3) {
            r0 = 0
            jb.p r0 = r3.m7945m(r0)
            java.lang.String r0 = r0.mo7944l()
            java.lang.String r1 = "chain_alias"
            boolean r0 = r1.equals(r0)
            r1 = 1
            jb.p r3 = r3.m7945m(r1)
            if (r0 == 0) goto L30
            int r3 = r3.mo7941a()
            xc.f r3 = p414xc.EnumC7031f.fromChainAlias(r3)
            xc.f r0 = p414xc.EnumC7031f.UNKNOWN
            if (r3 == r0) goto L28
            xc.g r0 = new xc.g
            r0.<init>(r3)
            return r0
        L28:
            uc.a r3 = new uc.a
            java.lang.String r0 = "Cannont create ChainId from variant, chain alias unknown"
            r3.<init>(r0)
            throw r3
        L30:
            java.lang.String r3 = r3.mo7944l()
            xc.f r0 = p414xc.EnumC7031f.fromChainId(r3)
            xc.f r1 = p414xc.EnumC7031f.UNKNOWN
            if (r0 != r1) goto L4a
            xc.g r0 = new xc.g
            int r2 = r1.getAlias()
            java.lang.String r1 = r1.name()
            r0.<init>(r3, r2, r1)
            return r0
        L4a:
            xc.g r3 = new xc.g
            r3.<init>(r0)
            return r3
    }

    public int getChainAlias() {
            r1 = this;
            int r0 = r1.gChainAlias
            return r0
    }

    public java.lang.String getChainId() {
            r1 = this;
            java.lang.String r0 = r1.gChainId
            return r0
    }

    public java.lang.String getChainName() {
            r1 = this;
            java.lang.String r0 = r1.gChainName
            return r0
    }

    public java.util.List<java.lang.Object> toVariant() {
            r2 = this;
            int r0 = r2.gChainAlias
            xc.f r1 = p414xc.EnumC7031f.UNKNOWN
            int r1 = r1.getAlias()
            if (r0 == r1) goto L1e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "chain_alias"
            r0.add(r1)
            int r1 = r2.gChainAlias
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L1a:
            r0.add(r1)
            return r0
        L1e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "chain_id"
            r0.add(r1)
            java.lang.String r1 = r2.gChainId
            goto L1a
    }
}
