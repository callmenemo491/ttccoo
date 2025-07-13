package p036c6;

/* renamed from: c6.d */
/* loaded from: classes.dex */
public class C0879d extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p036c6.C0879d> CREATOR = null;

    /* renamed from: Y */
    public java.lang.String f4745Y;

    /* renamed from: Z */
    public java.lang.String f4746Z;

    /* renamed from: a0 */
    public java.util.List<java.lang.String> f4747a0;

    /* renamed from: b0 */
    public java.lang.String f4748b0;

    /* renamed from: c0 */
    public android.net.Uri f4749c0;

    /* renamed from: d0 */
    public java.lang.String f4750d0;

    /* renamed from: e0 */
    public java.lang.String f4751e0;

    static {
            c6.v0 r0 = new c6.v0
            r0.<init>()
            p036c6.C0879d.CREATOR = r0
            return
    }

    public C0879d() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f4747a0 = r0
            return
    }

    public C0879d(java.lang.String r1, java.lang.String r2, java.util.List r3, java.lang.String r4, android.net.Uri r5, java.lang.String r6, java.lang.String r7) {
            r0 = this;
            r0.<init>()
            r0.f4745Y = r1
            r0.f4746Z = r2
            r0.f4747a0 = r3
            r0.f4748b0 = r4
            r0.f4749c0 = r5
            r0.f4750d0 = r6
            r0.f4751e0 = r7
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p036c6.C0879d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c6.d r5 = (p036c6.C0879d) r5
            java.lang.String r1 = r4.f4745Y
            java.lang.String r3 = r5.f4745Y
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L53
            java.lang.String r1 = r4.f4746Z
            java.lang.String r3 = r5.f4746Z
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L53
            java.util.List<java.lang.String> r1 = r4.f4747a0
            java.util.List<java.lang.String> r3 = r5.f4747a0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L53
            java.lang.String r1 = r4.f4748b0
            java.lang.String r3 = r5.f4748b0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L53
            android.net.Uri r1 = r4.f4749c0
            android.net.Uri r3 = r5.f4749c0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L53
            java.lang.String r1 = r4.f4750d0
            java.lang.String r3 = r5.f4750d0
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L53
            java.lang.String r1 = r4.f4751e0
            java.lang.String r5 = r5.f4751e0
            boolean r5 = p123h6.C2487a.m6368g(r1, r5)
            if (r5 == 0) goto L53
            return r0
        L53:
            return r2
    }

    public int hashCode() {
            r3 = this;
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r3.f4745Y
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.f4746Z
            r2 = 1
            r0[r2] = r1
            java.util.List<java.lang.String> r1 = r3.f4747a0
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = r3.f4748b0
            r2 = 3
            r0[r2] = r1
            android.net.Uri r1 = r3.f4749c0
            r2 = 4
            r0[r2] = r1
            java.lang.String r1 = r3.f4750d0
            r2 = 5
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @androidx.annotation.RecentlyNonNull
    public java.lang.String toString() {
            r14 = this;
            java.lang.String r0 = r14.f4745Y
            java.lang.String r1 = r14.f4746Z
            java.util.List<java.lang.String> r2 = r14.f4747a0
            if (r2 != 0) goto La
            r2 = 0
            goto Le
        La:
            int r2 = r2.size()
        Le:
            java.lang.String r3 = r14.f4748b0
            android.net.Uri r4 = r14.f4749c0
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = r14.f4750d0
            java.lang.String r6 = r14.f4751e0
            java.lang.String r7 = java.lang.String.valueOf(r0)
            int r7 = r7.length()
            java.lang.String r8 = java.lang.String.valueOf(r1)
            int r8 = r8.length()
            java.lang.String r9 = java.lang.String.valueOf(r3)
            int r9 = r9.length()
            int r10 = r4.length()
            java.lang.String r11 = java.lang.String.valueOf(r5)
            int r11 = r11.length()
            java.lang.String r12 = java.lang.String.valueOf(r6)
            int r12 = r12.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r7 = r7 + 118
            int r7 = r7 + r8
            int r7 = r7 + r9
            int r7 = r7 + r10
            int r7 = r7 + r11
            int r7 = r7 + r12
            r13.<init>(r7)
            java.lang.String r7 = "applicationId: "
            java.lang.String r8 = ", name: "
            p179k1.C3661s.m8090a(r13, r7, r0, r8, r1)
            java.lang.String r0 = ", namespaces.count: "
            r13.append(r0)
            r13.append(r2)
            java.lang.String r0 = ", senderAppIdentifier: "
            r13.append(r0)
            r13.append(r3)
            java.lang.String r0 = ", senderAppLaunchUrl: "
            java.lang.String r1 = ", iconUrl: "
            p179k1.C3661s.m8090a(r13, r0, r4, r1, r5)
            java.lang.String r0 = ", type: "
            java.lang.String r0 = p346u.C6269n.m12888a(r13, r0, r6)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r5, int r6) {
            r4 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r5, r0)
            java.lang.String r1 = r4.f4745Y
            r2 = 2
            r3 = 0
            p270p6.C5369c.m11719g(r5, r2, r1, r3)
            java.lang.String r1 = r4.f4746Z
            r2 = 3
            p270p6.C5369c.m11719g(r5, r2, r1, r3)
            r1 = 4
            r2 = 0
            p270p6.C5369c.m11722j(r5, r1, r2, r3)
            java.util.List<java.lang.String> r1 = r4.f4747a0
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r2 = 5
            p270p6.C5369c.m11720h(r5, r2, r1, r3)
            java.lang.String r1 = r4.f4748b0
            r2 = 6
            p270p6.C5369c.m11719g(r5, r2, r1, r3)
            android.net.Uri r1 = r4.f4749c0
            r2 = 7
            p270p6.C5369c.m11718f(r5, r2, r1, r6, r3)
            java.lang.String r6 = r4.f4750d0
            r1 = 8
            p270p6.C5369c.m11719g(r5, r1, r6, r3)
            java.lang.String r6 = r4.f4751e0
            r1 = 9
            p270p6.C5369c.m11719g(r5, r1, r6, r3)
            p270p6.C5369c.m11726n(r5, r0)
            return
    }
}
