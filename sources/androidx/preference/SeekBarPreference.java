package androidx.preference;

/* loaded from: classes.dex */
public class SeekBarPreference extends androidx.preference.Preference {

    /* renamed from: l0 */
    public int f3047l0;

    /* renamed from: m0 */
    public int f3048m0;

    /* renamed from: n0 */
    public int f3049n0;

    public SeekBarPreference(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r0 = 2130969420(0x7f04034c, float:1.7547521E38)
            r1 = 0
            r4.<init>(r5, r6, r0, r1)
            int[] r2 = p139i1.C3062e.f12295i
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r2, r0, r1)
            r6 = 3
            int r6 = r5.getInt(r6, r1)
            r4.f3047l0 = r6
            r6 = 1
            r0 = 100
            int r0 = r5.getInt(r6, r0)
            int r2 = r4.f3047l0
            if (r0 >= r2) goto L20
            r0 = r2
        L20:
            int r2 = r4.f3048m0
            if (r0 == r2) goto L26
            r4.f3048m0 = r0
        L26:
            r0 = 4
            int r0 = r5.getInt(r0, r1)
            int r2 = r4.f3049n0
            if (r0 == r2) goto L3e
            int r2 = r4.f3048m0
            int r3 = r4.f3047l0
            int r2 = r2 - r3
            int r0 = java.lang.Math.abs(r0)
            int r0 = java.lang.Math.min(r2, r0)
            r4.f3049n0 = r0
        L3e:
            r0 = 2
            r5.getBoolean(r0, r6)
            r6 = 5
            r5.getBoolean(r6, r1)
            r6 = 6
            r5.getBoolean(r6, r1)
            r5.recycle()
            return
    }

    @Override // androidx.preference.Preference
    /* renamed from: k */
    public java.lang.Object mo1615k(android.content.res.TypedArray r2, int r3) {
            r1 = this;
            r0 = 0
            int r2 = r2.getInt(r3, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }
}
