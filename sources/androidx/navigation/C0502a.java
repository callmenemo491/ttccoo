package androidx.navigation;

/* renamed from: androidx.navigation.a */
/* loaded from: classes.dex */
public final class C0502a implements androidx.navigation.InterfaceC0519n {

    /* renamed from: a */
    public final int f2906a;

    public C0502a(int r1) {
            r0 = this;
            r0.<init>()
            r0.f2906a = r1
            return
    }

    @Override // androidx.navigation.InterfaceC0519n
    /* renamed from: a */
    public android.os.Bundle mo1575a() {
            r1 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            return r0
    }

    @Override // androidx.navigation.InterfaceC0519n
    /* renamed from: b */
    public int mo1576b() {
            r1 = this;
            int r0 = r1.f2906a
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L1a
            java.lang.Class<androidx.navigation.a> r2 = androidx.navigation.C0502a.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L1a
        L10:
            androidx.navigation.a r5 = (androidx.navigation.C0502a) r5
            int r2 = r4.f2906a
            int r5 = r5.f2906a
            if (r2 == r5) goto L19
            return r1
        L19:
            return r0
        L1a:
            return r1
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.f2906a
            r1 = 31
            int r1 = r1 + r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ActionOnlyNavDirections(actionId="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            int r1 = r3.f2906a
            java.lang.String r2 = ")"
            java.lang.String r0 = p381w.C6764e.m13690a(r0, r1, r2)
            return r0
    }
}
