package p105g2;

/* renamed from: g2.h */
/* loaded from: classes.dex */
public final class C2214h {

    /* renamed from: a */
    public final java.lang.String f10128a;

    /* renamed from: b */
    public final java.lang.String f10129b;

    public C2214h(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f10128a = r1
            r0.f10129b = r2
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L29
            java.lang.Class<g2.h> r2 = p105g2.C2214h.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L29
        L10:
            g2.h r5 = (p105g2.C2214h) r5
            java.lang.String r2 = r4.f10128a
            java.lang.String r3 = r5.f10128a
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L27
            java.lang.String r2 = r4.f10129b
            java.lang.String r5 = r5.f10129b
            boolean r5 = android.text.TextUtils.equals(r2, r5)
            if (r5 == 0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
        L29:
            return r1
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f10128a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.f10129b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Header[name="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r3.f10128a
            r0.append(r1)
            java.lang.String r1 = ",value="
            r0.append(r1)
            java.lang.String r1 = r3.f10129b
            java.lang.String r2 = "]"
            java.lang.String r0 = p346u.C6269n.m12888a(r0, r1, r2)
            return r0
    }
}
