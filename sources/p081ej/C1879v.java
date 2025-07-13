package p081ej;

/* renamed from: ej.v */
/* loaded from: classes.dex */
public class C1879v extends p317ri.AbstractC5894m implements p317ri.InterfaceC5867d {

    /* renamed from: Y */
    public p317ri.AbstractC5912s f8129Y;

    public C1879v(p317ri.AbstractC5912s r2) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2 instanceof p317ri.C5930z
            if (r0 != 0) goto L14
            boolean r0 = r2 instanceof p317ri.C5882i
            if (r0 == 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unknown object passed to Time"
            r2.<init>(r0)
            throw r2
        L14:
            r1.f8129Y = r2
            return
    }

    /* renamed from: n */
    public static p081ej.C1879v m4638n(java.lang.Object r2) {
            if (r2 == 0) goto L3a
            boolean r0 = r2 instanceof p081ej.C1879v
            if (r0 == 0) goto L7
            goto L3a
        L7:
            boolean r0 = r2 instanceof p317ri.C5930z
            if (r0 == 0) goto L13
            ej.v r0 = new ej.v
            ri.z r2 = (p317ri.C5930z) r2
            r0.<init>(r2)
            return r0
        L13:
            boolean r0 = r2 instanceof p317ri.C5882i
            if (r0 == 0) goto L1f
            ej.v r0 = new ej.v
            ri.i r2 = (p317ri.C5882i) r2
            r0.<init>(r2)
            return r0
        L1f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "unknown object in factory: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        L3a:
            ej.v r2 = (p081ej.C1879v) r2
            return r2
    }

    @Override // p317ri.AbstractC5894m, p317ri.InterfaceC5870e
    /* renamed from: e */
    public p317ri.AbstractC5912s mo168e() {
            r1 = this;
            ri.s r0 = r1.f8129Y
            return r0
    }

    public java.lang.String toString() {
            r7 = this;
            ri.s r0 = r7.f8129Y
            boolean r1 = r0 instanceof p317ri.C5930z
            if (r1 == 0) goto Lb1
            ri.z r0 = (p317ri.C5930z) r0
            byte[] r0 = r0.f22758Y
            java.lang.String r0 = p400wj.C6892e.m13958a(r0)
            r1 = 45
            int r2 = r0.indexOf(r1)
            r3 = 43
            r4 = 12
            r5 = 10
            r6 = 0
            if (r2 >= 0) goto L49
            int r2 = r0.indexOf(r3)
            if (r2 >= 0) goto L49
            int r1 = r0.length()
            r2 = 11
            if (r1 != r2) goto L3a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r0.substring(r6, r5)
            r1.append(r0)
            java.lang.String r0 = "00GMT+00:00"
            goto L8e
        L3a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r0.substring(r6, r4)
            r1.append(r0)
            java.lang.String r0 = "GMT+00:00"
            goto L8e
        L49:
            int r1 = r0.indexOf(r1)
            if (r1 >= 0) goto L53
            int r1 = r0.indexOf(r3)
        L53:
            int r2 = r0.length()
            int r2 = r2 + (-3)
            if (r1 != r2) goto L61
            java.lang.String r2 = "00"
            java.lang.String r0 = p064e.C1493g.m4049a(r0, r2)
        L61:
            java.lang.String r2 = ":"
            r3 = 15
            if (r1 != r5) goto L7b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "00GMT"
            one.block.eosiojava.utilities.C5331a.m11639a(r0, r6, r5, r1, r4)
            r4 = 13
            one.block.eosiojava.utilities.C5331a.m11639a(r0, r5, r4, r1, r2)
            java.lang.String r0 = r0.substring(r4, r3)
            goto L8e
        L7b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "GMT"
            one.block.eosiojava.utilities.C5331a.m11639a(r0, r6, r4, r1, r5)
            one.block.eosiojava.utilities.C5331a.m11639a(r0, r4, r3, r1, r2)
            r2 = 17
            java.lang.String r0 = r0.substring(r3, r2)
        L8e:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            char r1 = r0.charAt(r6)
            r2 = 53
            if (r1 >= r2) goto La5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "20"
            goto Lac
        La5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "19"
        Lac:
            java.lang.String r0 = p346u.C6269n.m12888a(r1, r2, r0)
            goto Lb7
        Lb1:
            ri.i r0 = (p317ri.C5882i) r0
            java.lang.String r0 = r0.m12228H()
        Lb7:
            return r0
    }
}
