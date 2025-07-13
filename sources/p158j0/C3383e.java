package p158j0;

/* renamed from: j0.e */
/* loaded from: classes.dex */
public final class C3383e implements p158j0.InterfaceC3384f {

    /* renamed from: b */
    public static final java.util.Locale[] f14540b = null;

    /* renamed from: a */
    public final java.util.Locale[] f14541a;

    static {
            r0 = 0
            java.util.Locale[] r1 = new java.util.Locale[r0]
            p158j0.C3383e.f14540b = r1
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r2 = "en"
            java.lang.String r3 = "XA"
            r1.<init>(r2, r3)
            java.util.Locale r1 = new java.util.Locale
            java.lang.String r2 = "ar"
            java.lang.String r3 = "XB"
            r1.<init>(r2, r3)
            int r1 = p158j0.C3382d.f14538b
            r1 = -1
            r2 = 2
            r3 = 1
            java.lang.String r4 = "en-Latn"
            java.lang.String r5 = "-"
            java.lang.String[] r1 = r4.split(r5, r1)
            int r4 = r1.length
            if (r4 <= r2) goto L33
            java.util.Locale r4 = new java.util.Locale
            r0 = r1[r0]
            r3 = r1[r3]
            r1 = r1[r2]
            r4.<init>(r0, r3, r1)
            goto L4a
        L33:
            int r2 = r1.length
            if (r2 <= r3) goto L40
            java.util.Locale r2 = new java.util.Locale
            r0 = r1[r0]
            r1 = r1[r3]
            r2.<init>(r0, r1)
            goto L4a
        L40:
            int r2 = r1.length
            if (r2 != r3) goto L4b
            java.util.Locale r2 = new java.util.Locale
            r0 = r1[r0]
            r2.<init>(r0)
        L4a:
            return
        L4b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can not parse language tag: [en-Latn]"
            r0.<init>(r1)
            throw r0
    }

    public C3383e(java.util.Locale... r6) {
            r5 = this;
            r5.<init>()
            int r0 = r6.length
            if (r0 != 0) goto Lb
            java.util.Locale[] r6 = p158j0.C3383e.f14540b
            r5.f14541a = r6
            goto L61
        Lb:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2 = 0
        L16:
            int r3 = r6.length
            if (r2 >= r3) goto L53
            r3 = r6[r2]
            if (r3 == 0) goto L45
            boolean r4 = r1.contains(r3)
            if (r4 == 0) goto L24
            goto L42
        L24:
            java.lang.Object r3 = r3.clone()
            java.util.Locale r3 = (java.util.Locale) r3
            r0.add(r3)
            r3.getLanguage()
            java.lang.String r4 = r3.getCountry()
            if (r4 == 0) goto L3f
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L3f
            r3.getCountry()
        L3f:
            r1.add(r3)
        L42:
            int r2 = r2 + 1
            goto L16
        L45:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "list["
            java.lang.String r1 = "] is null"
            java.lang.String r0 = android.support.v4.media.C0146e.m258a(r0, r2, r1)
            r6.<init>(r0)
            throw r6
        L53:
            int r6 = r0.size()
            java.util.Locale[] r6 = new java.util.Locale[r6]
            java.lang.Object[] r6 = r0.toArray(r6)
            java.util.Locale[] r6 = (java.util.Locale[]) r6
            r5.f14541a = r6
        L61:
            return
    }

    @Override // p158j0.InterfaceC3384f
    /* renamed from: a */
    public java.lang.Object mo7758a() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p158j0.C3383e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            j0.e r6 = (p158j0.C3383e) r6
            java.util.Locale[] r6 = r6.f14541a
            java.util.Locale[] r1 = r5.f14541a
            int r1 = r1.length
            int r3 = r6.length
            if (r1 == r3) goto L15
            return r2
        L15:
            r1 = 0
        L16:
            java.util.Locale[] r3 = r5.f14541a
            int r4 = r3.length
            if (r1 >= r4) goto L29
            r3 = r3[r1]
            r4 = r6[r1]
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L26
            return r2
        L26:
            int r1 = r1 + 1
            goto L16
        L29:
            return r0
    }

    @Override // p158j0.InterfaceC3384f
    public java.util.Locale get(int r3) {
            r2 = this;
            if (r3 < 0) goto La
            java.util.Locale[] r0 = r2.f14541a
            int r1 = r0.length
            if (r3 >= r1) goto La
            r3 = r0[r3]
            goto Lb
        La:
            r3 = 0
        Lb:
            return r3
    }

    public int hashCode() {
            r4 = this;
            r0 = 1
            r1 = 0
        L2:
            java.util.Locale[] r2 = r4.f14541a
            int r3 = r2.length
            if (r1 >= r3) goto L13
            int r0 = r0 * 31
            r2 = r2[r1]
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L2
        L13:
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "["
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            r1 = 0
        L7:
            java.util.Locale[] r2 = r4.f14541a
            int r3 = r2.length
            if (r1 >= r3) goto L20
            r2 = r2[r1]
            r0.append(r2)
            java.util.Locale[] r2 = r4.f14541a
            int r2 = r2.length
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L1d
            r2 = 44
            r0.append(r2)
        L1d:
            int r1 = r1 + 1
            goto L7
        L20:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
