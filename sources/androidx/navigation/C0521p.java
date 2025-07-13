package androidx.navigation;

@androidx.navigation.AbstractC0527v.b("navigation")
/* renamed from: androidx.navigation.p */
/* loaded from: classes.dex */
public class C0521p extends androidx.navigation.AbstractC0527v<androidx.navigation.C0520o> {

    /* renamed from: a */
    public final androidx.navigation.C0528w f2990a;

    public C0521p(androidx.navigation.C0528w r1) {
            r0 = this;
            r0.<init>()
            r0.f2990a = r1
            return
    }

    @Override // androidx.navigation.AbstractC0527v
    /* renamed from: a */
    public androidx.navigation.C0518m mo1577a() {
            r1 = this;
            androidx.navigation.o r0 = new androidx.navigation.o
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.navigation.AbstractC0527v
    /* renamed from: b */
    public androidx.navigation.C0518m mo1578b(androidx.navigation.C0518m r3, android.os.Bundle r4, androidx.navigation.C0524s r5, androidx.navigation.AbstractC0527v.a r6) {
            r2 = this;
            androidx.navigation.o r3 = (androidx.navigation.C0520o) r3
            int r0 = r3.f2985h0
            if (r0 != 0) goto L2c
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "no start destination defined via app:startDestination for "
            java.lang.StringBuilder r5 = android.support.v4.media.C0144c.m256a(r5)
            int r6 = r3.f2973a0
            if (r6 == 0) goto L1f
            java.lang.String r0 = r3.f2974b0
            if (r0 != 0) goto L1c
            java.lang.String r6 = java.lang.Integer.toString(r6)
            r3.f2974b0 = r6
        L1c:
            java.lang.String r3 = r3.f2974b0
            goto L21
        L1f:
            java.lang.String r3 = "the root navigation"
        L21:
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L2c:
            r1 = 0
            androidx.navigation.m r0 = r3.m1598p(r0, r1)
            if (r0 != 0) goto L4f
            java.lang.String r4 = r3.f2986i0
            if (r4 != 0) goto L3f
            int r4 = r3.f2985h0
            java.lang.String r4 = java.lang.Integer.toString(r4)
            r3.f2986i0 = r4
        L3f:
            java.lang.String r3 = r3.f2986i0
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "navigation destination "
            java.lang.String r6 = " is not a direct child of this NavGraph"
            java.lang.String r3 = android.support.v4.media.C0145d.m257a(r5, r3, r6)
            r4.<init>(r3)
            throw r4
        L4f:
            androidx.navigation.w r3 = r2.f2990a
            java.lang.String r1 = r0.f2971Y
            androidx.navigation.v r3 = r3.m1613c(r1)
            android.os.Bundle r4 = r0.m1592a(r4)
            androidx.navigation.m r3 = r3.mo1578b(r0, r4, r5, r6)
            return r3
    }

    @Override // androidx.navigation.AbstractC0527v
    /* renamed from: e */
    public boolean mo1579e() {
            r1 = this;
            r0 = 1
            return r0
    }
}
