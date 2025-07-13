package androidx.preference;

/* loaded from: classes.dex */
public class Preference implements java.lang.Comparable<androidx.preference.Preference> {

    /* renamed from: Y */
    public android.content.Context f3033Y;

    /* renamed from: Z */
    public int f3034Z;

    /* renamed from: a0 */
    public java.lang.CharSequence f3035a0;

    /* renamed from: b0 */
    public java.lang.CharSequence f3036b0;

    /* renamed from: c0 */
    public java.lang.String f3037c0;

    /* renamed from: d0 */
    public java.lang.String f3038d0;

    /* renamed from: e0 */
    public boolean f3039e0;

    /* renamed from: f0 */
    public boolean f3040f0;

    /* renamed from: g0 */
    public boolean f3041g0;

    /* renamed from: h0 */
    public java.lang.Object f3042h0;

    /* renamed from: i0 */
    public boolean f3043i0;

    /* renamed from: j0 */
    public boolean f3044j0;

    /* renamed from: k0 */
    public androidx.preference.Preference.InterfaceC0533a f3045k0;

    /* renamed from: androidx.preference.Preference$a */
    public interface InterfaceC0533a<T extends androidx.preference.Preference> {
        /* renamed from: a */
        java.lang.CharSequence mo1616a(T r1);
    }

    public Preference(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r0 = 2130969378(0x7f040322, float:1.7547436E38)
            r1 = 16842894(0x101008e, float:2.3693956E-38)
            int r0 = p065e0.C1505j.m4087a(r3, r0, r1)
            r1 = 0
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public Preference(android.content.Context r4, android.util.AttributeSet r5, int r6, int r7) {
            r3 = this;
            r3.<init>()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r3.f3034Z = r0
            r1 = 1
            r3.f3039e0 = r1
            r3.f3040f0 = r1
            r3.f3041g0 = r1
            r3.f3043i0 = r1
            r3.f3044j0 = r1
            r3.f3033Y = r4
            int[] r2 = p139i1.C3062e.f12292f
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r6, r7)
            r5 = 23
            r6 = 0
            p065e0.C1505j.m4091e(r4, r5, r6, r6)
            r5 = 26
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L2e
            r5 = 6
            java.lang.String r5 = r4.getString(r5)
        L2e:
            r3.f3037c0 = r5
            r5 = 34
            r7 = 4
            java.lang.CharSequence r5 = r4.getText(r5)
            if (r5 != 0) goto L3d
            java.lang.CharSequence r5 = r4.getText(r7)
        L3d:
            r3.f3035a0 = r5
            r5 = 33
            r7 = 7
            java.lang.CharSequence r5 = r4.getText(r5)
            if (r5 != 0) goto L4c
            java.lang.CharSequence r5 = r4.getText(r7)
        L4c:
            r3.f3036b0 = r5
            r5 = 28
            r7 = 8
            int r7 = r4.getInt(r7, r0)
            int r5 = r4.getInt(r5, r7)
            r3.f3034Z = r5
            r5 = 22
            r7 = 13
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L6a
            java.lang.String r5 = r4.getString(r7)
        L6a:
            r3.f3038d0 = r5
            r5 = 27
            r7 = 3
            r0 = 2131558568(0x7f0d00a8, float:1.8742455E38)
            int r7 = r4.getResourceId(r7, r0)
            r4.getResourceId(r5, r7)
            r5 = 35
            r7 = 9
            int r7 = r4.getResourceId(r7, r6)
            r4.getResourceId(r5, r7)
            r5 = 21
            r7 = 2
            boolean r7 = r4.getBoolean(r7, r1)
            boolean r5 = r4.getBoolean(r5, r7)
            r3.f3039e0 = r5
            r5 = 30
            r7 = 5
            boolean r7 = r4.getBoolean(r7, r1)
            boolean r5 = r4.getBoolean(r5, r7)
            r3.f3040f0 = r5
            r5 = 29
            boolean r7 = r4.getBoolean(r1, r1)
            boolean r5 = r4.getBoolean(r5, r7)
            r3.f3041g0 = r5
            r5 = 19
            r7 = 10
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto Lb7
            r4.getString(r7)
        Lb7:
            boolean r5 = r3.f3040f0
            r7 = 16
            boolean r5 = r4.getBoolean(r7, r5)
            r4.getBoolean(r7, r5)
            boolean r5 = r3.f3040f0
            r7 = 17
            boolean r5 = r4.getBoolean(r7, r5)
            r4.getBoolean(r7, r5)
            r5 = 18
            boolean r7 = r4.hasValue(r5)
            if (r7 == 0) goto Ld6
            goto Lde
        Ld6:
            r5 = 11
            boolean r7 = r4.hasValue(r5)
            if (r7 == 0) goto Le4
        Lde:
            java.lang.Object r5 = r3.mo1615k(r4, r5)
            r3.f3042h0 = r5
        Le4:
            r5 = 31
            r7 = 12
            boolean r7 = r4.getBoolean(r7, r1)
            r4.getBoolean(r5, r7)
            r5 = 32
            boolean r7 = r4.hasValue(r5)
            if (r7 == 0) goto L100
            r7 = 14
            boolean r7 = r4.getBoolean(r7, r1)
            r4.getBoolean(r5, r7)
        L100:
            r5 = 24
            r7 = 15
            boolean r7 = r4.getBoolean(r7, r6)
            r4.getBoolean(r5, r7)
            r5 = 25
            boolean r7 = r4.getBoolean(r5, r1)
            r4.getBoolean(r5, r7)
            r5 = 20
            boolean r6 = r4.getBoolean(r5, r6)
            r4.getBoolean(r5, r6)
            r4.recycle()
            return
    }

    @Override // java.lang.Comparable
    public int compareTo(androidx.preference.Preference r3) {
            r2 = this;
            androidx.preference.Preference r3 = (androidx.preference.Preference) r3
            int r0 = r2.f3034Z
            int r1 = r3.f3034Z
            if (r0 == r1) goto La
            int r0 = r0 - r1
            goto L28
        La:
            java.lang.CharSequence r0 = r2.f3035a0
            java.lang.CharSequence r1 = r3.f3035a0
            if (r0 != r1) goto L12
            r0 = 0
            goto L28
        L12:
            if (r0 != 0) goto L16
            r0 = 1
            goto L28
        L16:
            if (r1 != 0) goto L1a
            r0 = -1
            goto L28
        L1a:
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r3 = r3.f3035a0
            java.lang.String r3 = r3.toString()
            int r0 = r0.compareToIgnoreCase(r3)
        L28:
            return r0
    }

    /* renamed from: e */
    public java.lang.CharSequence mo1617e() {
            r1 = this;
            androidx.preference.Preference$a r0 = r1.f3045k0
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.mo1616a(r1)
            return r0
        L9:
            java.lang.CharSequence r0 = r1.f3036b0
            return r0
    }

    /* renamed from: g */
    public boolean mo1619g() {
            r1 = this;
            boolean r0 = r1.f3039e0
            if (r0 == 0) goto Le
            boolean r0 = r1.f3043i0
            if (r0 == 0) goto Le
            boolean r0 = r1.f3044j0
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    /* renamed from: h */
    public void mo1614h() {
            r0 = this;
            return
    }

    /* renamed from: k */
    public java.lang.Object mo1615k(android.content.res.TypedArray r1, int r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: l */
    public boolean mo1620l() {
            r1 = this;
            boolean r0 = r1.mo1619g()
            r0 = r0 ^ 1
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.CharSequence r1 = r4.f3035a0
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 32
            if (r2 != 0) goto L15
            r0.append(r1)
            r0.append(r3)
        L15:
            java.lang.CharSequence r1 = r4.mo1617e()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L25
            r0.append(r1)
            r0.append(r3)
        L25:
            int r1 = r0.length()
            if (r1 <= 0) goto L34
            int r1 = r0.length()
            int r1 = r1 + (-1)
            r0.setLength(r1)
        L34:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
