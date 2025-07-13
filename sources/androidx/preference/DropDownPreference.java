package androidx.preference;

/* loaded from: classes.dex */
public class DropDownPreference extends androidx.preference.ListPreference {

    /* renamed from: p0 */
    public final android.content.Context f3025p0;

    /* renamed from: q0 */
    public final android.widget.ArrayAdapter f3026q0;

    public DropDownPreference(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 0
            r1 = 2130968944(0x7f040170, float:1.7546556E38)
            r3.<init>(r4, r5, r1, r0)
            r3.f3025p0 = r4
            android.widget.ArrayAdapter r5 = new android.widget.ArrayAdapter
            r1 = 17367049(0x1090009, float:2.516295E-38)
            r5.<init>(r4, r1)
            r3.f3026q0 = r5
            r5.clear()
            java.lang.CharSequence[] r4 = r3.f3028l0
            if (r4 == 0) goto L2b
            int r5 = r4.length
        L1b:
            if (r0 >= r5) goto L2b
            r1 = r4[r0]
            android.widget.ArrayAdapter r2 = r3.f3026q0
            java.lang.String r1 = r1.toString()
            r2.add(r1)
            int r0 = r0 + 1
            goto L1b
        L2b:
            return
    }

    @Override // androidx.preference.Preference
    /* renamed from: h */
    public void mo1614h() {
            r1 = this;
            android.widget.ArrayAdapter r0 = r1.f3026q0
            if (r0 == 0) goto L7
            r0.notifyDataSetChanged()
        L7:
            return
    }
}
