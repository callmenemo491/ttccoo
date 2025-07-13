package p036c6;

/* renamed from: c6.h */
/* loaded from: classes.dex */
public class C0887h extends p270p6.AbstractC5367a {

    @androidx.annotation.RecentlyNonNull
    public static final android.os.Parcelable.Creator<p036c6.C0887h> CREATOR = null;

    /* renamed from: Y */
    public boolean f4765Y;

    /* renamed from: Z */
    public java.lang.String f4766Z;

    /* renamed from: a0 */
    public boolean f4767a0;

    /* renamed from: b0 */
    public p036c6.C0885g f4768b0;

    static {
            c6.i0 r0 = new c6.i0
            r0.<init>()
            p036c6.C0887h.CREATOR = r0
            return
    }

    public C0887h() {
            r5 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.util.regex.Pattern r1 = p123h6.C2487a.f11248a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 20
            r1.<init>(r2)
            java.lang.String r2 = r0.getLanguage()
            r1.append(r2)
            java.lang.String r2 = r0.getCountry()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = 45
            if (r3 != 0) goto L26
            r1.append(r4)
            r1.append(r2)
        L26:
            java.lang.String r0 = r0.getVariant()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L36
            r1.append(r4)
            r1.append(r0)
        L36:
            java.lang.String r0 = r1.toString()
            r1 = 0
            r5.<init>()
            r2 = 0
            r5.f4765Y = r2
            r5.f4766Z = r0
            r5.f4767a0 = r2
            r5.f4768b0 = r1
            return
    }

    public C0887h(boolean r1, java.lang.String r2, boolean r3, p036c6.C0885g r4) {
            r0 = this;
            r0.<init>()
            r0.f4765Y = r1
            r0.f4766Z = r2
            r0.f4767a0 = r3
            r0.f4768b0 = r4
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p036c6.C0887h
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c6.h r5 = (p036c6.C0887h) r5
            boolean r1 = r4.f4765Y
            boolean r3 = r5.f4765Y
            if (r1 != r3) goto L2d
            java.lang.String r1 = r4.f4766Z
            java.lang.String r3 = r5.f4766Z
            boolean r1 = p123h6.C2487a.m6368g(r1, r3)
            if (r1 == 0) goto L2d
            boolean r1 = r4.f4767a0
            boolean r3 = r5.f4767a0
            if (r1 != r3) goto L2d
            c6.g r1 = r4.f4768b0
            c6.g r5 = r5.f4768b0
            boolean r5 = p123h6.C2487a.m6368g(r1, r5)
            if (r5 == 0) goto L2d
            return r0
        L2d:
            return r2
    }

    public int hashCode() {
            r3 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            boolean r1 = r3.f4765Y
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.f4766Z
            r2 = 1
            r0[r2] = r1
            boolean r1 = r3.f4767a0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            c6.g r1 = r3.f4768b0
            r2 = 3
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @androidx.annotation.RecentlyNonNull
    public java.lang.String toString() {
            r3 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            boolean r1 = r3.f4765Y
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = r3.f4766Z
            r2 = 1
            r0[r2] = r1
            boolean r1 = r3.f4767a0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "LaunchOptions(relaunchIfRunning=%b, language=%s, androidReceiverCompatible: %b)"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.RecentlyNonNull android.os.Parcel r6, int r7) {
            r5 = this;
            r0 = 20293(0x4f45, float:2.8437E-41)
            int r0 = p270p6.C5369c.m11723k(r6, r0)
            r1 = 2
            boolean r2 = r5.f4765Y
            r3 = 4
            p270p6.C5369c.m11724l(r6, r1, r3)
            r6.writeInt(r2)
            r1 = 3
            java.lang.String r2 = r5.f4766Z
            r4 = 0
            p270p6.C5369c.m11719g(r6, r1, r2, r4)
            boolean r1 = r5.f4767a0
            p270p6.C5369c.m11724l(r6, r3, r3)
            r6.writeInt(r1)
            r1 = 5
            c6.g r2 = r5.f4768b0
            p270p6.C5369c.m11718f(r6, r1, r2, r7, r4)
            p270p6.C5369c.m11726n(r6, r0)
            return
    }
}
