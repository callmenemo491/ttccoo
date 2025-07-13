package androidx.preference;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends androidx.preference.DialogPreference {
    public MultiSelectListPreference(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 2130968917(0x7f040155, float:1.7546501E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = p065e0.C1505j.m4087a(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            int[] r2 = p139i1.C3062e.f12291e
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            r5 = 2
            p065e0.C1505j.m4093g(r4, r5, r1)
            r5 = 3
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
            if (r5 != 0) goto L28
            r5 = 1
            r4.getTextArray(r5)
        L28:
            r4.recycle()
            return
    }

    @Override // androidx.preference.Preference
    /* renamed from: k */
    public java.lang.Object mo1615k(android.content.res.TypedArray r4, int r5) {
            r3 = this;
            java.lang.CharSequence[] r4 = r4.getTextArray(r5)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            int r0 = r4.length
            r1 = 0
        Lb:
            if (r1 >= r0) goto L19
            r2 = r4[r1]
            java.lang.String r2 = r2.toString()
            r5.add(r2)
            int r1 = r1 + 1
            goto Lb
        L19:
            return r5
    }
}
