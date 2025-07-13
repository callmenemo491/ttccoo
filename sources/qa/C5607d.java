package qa;

/* renamed from: qa.d */
/* loaded from: classes.dex */
public final class C5607d {

    /* renamed from: a */
    public final java.lang.String f21772a;

    /* renamed from: b */
    public final java.util.Map<java.lang.Class<?>, java.lang.Object> f21773b;

    /* renamed from: qa.d$a */
    public static /* synthetic */ class a {
    }

    public C5607d(java.lang.String r1, java.util.Map<java.lang.Class<?>, java.lang.Object> r2) {
            r0 = this;
            r0.<init>()
            r0.f21772a = r1
            r0.f21773b = r2
            return
    }

    public C5607d(java.lang.String r1, java.util.Map r2, qa.C5607d.a r3) {
            r0 = this;
            r0.<init>()
            r0.f21772a = r1
            r0.f21773b = r2
            return
    }

    /* renamed from: a */
    public static qa.C5607d m11888a(java.lang.String r2) {
            qa.d r0 = new qa.d
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.<init>(r2, r1)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof qa.C5607d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qa.d r5 = (qa.C5607d) r5
            java.lang.String r1 = r4.f21772a
            java.lang.String r3 = r5.f21772a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L21
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r4.f21773b
            java.util.Map<java.lang.Class<?>, java.lang.Object> r5 = r5.f21773b
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L21
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f21772a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r2.f21773b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "FieldDescriptor{name="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r2.f21772a
            r0.append(r1)
            java.lang.String r1 = ", properties="
            r0.append(r1)
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r2.f21773b
            java.util.Collection r1 = r1.values()
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
