package p170jc;

/* renamed from: jc.a */
/* loaded from: classes.dex */
public final class C3484a {

    /* renamed from: a */
    public final p150ic.C3126b f14973a;

    /* renamed from: b */
    public final p150ic.C3126b f14974b;

    /* renamed from: c */
    public final p150ic.C3127c f14975c;

    public C3484a(p150ic.C3126b r1, p150ic.C3126b r2, p150ic.C3127c r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f14973a = r1
            r0.f14974b = r2
            r0.f14975c = r3
            return
    }

    /* renamed from: a */
    public static boolean m7955a(java.lang.Object r0, java.lang.Object r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
        L8:
            boolean r0 = r0.equals(r1)
            return r0
    }

    /* renamed from: b */
    public static int m7956b(java.lang.Object r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r0.hashCode()
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p170jc.C3484a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            jc.a r4 = (p170jc.C3484a) r4
            ic.b r0 = r3.f14973a
            ic.b r2 = r4.f14973a
            boolean r0 = m7955a(r0, r2)
            if (r0 == 0) goto L28
            ic.b r0 = r3.f14974b
            ic.b r2 = r4.f14974b
            boolean r0 = m7955a(r0, r2)
            if (r0 == 0) goto L28
            ic.c r0 = r3.f14975c
            ic.c r4 = r4.f14975c
            boolean r4 = m7955a(r0, r4)
            if (r4 == 0) goto L28
            r4 = 1
            return r4
        L28:
            return r1
    }

    public int hashCode() {
            r2 = this;
            ic.b r0 = r2.f14973a
            int r0 = m7956b(r0)
            ic.b r1 = r2.f14974b
            int r1 = m7956b(r1)
            r0 = r0 ^ r1
            ic.c r1 = r2.f14975c
            int r1 = m7956b(r1)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[ "
            r0.<init>(r1)
            ic.b r1 = r2.f14973a
            r0.append(r1)
            java.lang.String r1 = " , "
            r0.append(r1)
            ic.b r1 = r2.f14974b
            r0.append(r1)
            java.lang.String r1 = " : "
            r0.append(r1)
            ic.c r1 = r2.f14975c
            if (r1 != 0) goto L22
            java.lang.String r1 = "null"
            goto L28
        L22:
            int r1 = r1.f12542a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L28:
            r0.append(r1)
            java.lang.String r1 = " ]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
