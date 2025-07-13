package p414xc;

/* renamed from: xc.e */
/* loaded from: classes.dex */
public class C7030e implements p394wc.InterfaceC6831b {
    public static final java.lang.String VARIANT_TYPE = "action[]";
    private java.util.List<p414xc.C7027b> gActions;

    public C7030e() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.gActions = r0
            return
    }

    public C7030e(java.util.List<p414xc.C7027b> r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.gActions = r0
            r1.gActions = r2
            return
    }

    public C7030e(p169jb.C3470m r4) {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.gActions = r0
            java.util.Iterator r4 = r4.iterator()
        Le:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r4.next()
            jb.p r0 = (p169jb.AbstractC3473p) r0
            boolean r1 = r0 instanceof p169jb.C3476s
            if (r1 == 0) goto L2b
            java.util.List<xc.b> r1 = r3.gActions
            xc.b r2 = new xc.b
            jb.s r0 = (p169jb.C3476s) r0
            r2.<init>(r0)
            r1.add(r2)
            goto Le
        L2b:
            uc.a r4 = new uc.a
            java.lang.String r0 = "action[] should be an array of objects"
            r4.<init>(r0)
            throw r4
        L33:
            return
    }

    public void addAction(p414xc.C7027b r2) {
            r1 = this;
            java.util.List<xc.b> r0 = r1.gActions
            r0.add(r2)
            return
    }

    public java.util.List<p414xc.C7027b> getActions() {
            r1 = this;
            java.util.List<xc.b> r0 = r1.gActions
            return r0
    }

    public java.util.List<p414xc.C7027b> getRawActions() {
            r1 = this;
            java.util.List r0 = r1.getActions()
            return r0
    }

    @Override // p394wc.InterfaceC6831b
    public java.util.List<java.lang.Object> toVariant() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "action[]"
            r0.add(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r2 = r4.getActions()
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r2.next()
            xc.b r3 = (p414xc.C7027b) r3
            java.util.Map r3 = r3.toMap()
            r1.add(r3)
            goto L17
        L2b:
            r0.add(r1)
            return r0
    }
}
