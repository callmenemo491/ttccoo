package androidx.preference;

/* loaded from: classes.dex */
public abstract class PreferenceGroup extends androidx.preference.Preference {

    /* renamed from: l0 */
    public java.util.List<androidx.preference.Preference> f3046l0;

    public PreferenceGroup(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r0)
            return
    }

    public PreferenceGroup(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
            r1 = this;
            r1.<init>(r2, r3, r4, r5)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f3046l0 = r0
            int[] r0 = p139i1.C3062e.f12293g
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0, r4, r5)
            r3 = 2
            r4 = 1
            p065e0.C1505j.m4088b(r2, r3, r3, r4)
            boolean r3 = r2.hasValue(r4)
            if (r3 == 0) goto L54
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r5 = r2.getInt(r4, r3)
            int r5 = r2.getInt(r4, r5)
            if (r5 == r3) goto L54
            java.lang.String r3 = r1.f3037c0
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r3 = r3 ^ r4
            if (r3 != 0) goto L54
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class r4 = r1.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r3.append(r4)
            java.lang.String r4 = " should have a key defined if it contains an expandable preference"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "PreferenceGroup"
            android.util.Log.e(r4, r3)
        L54:
            r2.recycle()
            return
    }
}
