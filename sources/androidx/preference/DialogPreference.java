package androidx.preference;

/* loaded from: classes.dex */
public abstract class DialogPreference extends androidx.preference.Preference {
    public DialogPreference(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r0 = 2130968917(0x7f040155, float:1.7546501E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = p065e0.C1505j.m4087a(r3, r0, r1)
            r1 = 0
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public DialogPreference(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
            r1 = this;
            r1.<init>(r2, r3, r4, r5)
            int[] r0 = p139i1.C3062e.f12288b
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0, r4, r5)
            r3 = 9
            r4 = 0
            p065e0.C1505j.m4092f(r2, r3, r4)
            r3 = 8
            r5 = 1
            java.lang.String r3 = r2.getString(r3)
            if (r3 != 0) goto L1b
            r2.getString(r5)
        L1b:
            r3 = 6
            r5 = 2
            android.graphics.drawable.Drawable r3 = r2.getDrawable(r3)
            if (r3 != 0) goto L26
            r2.getDrawable(r5)
        L26:
            r3 = 11
            r5 = 3
            java.lang.String r3 = r2.getString(r3)
            if (r3 != 0) goto L32
            r2.getString(r5)
        L32:
            r3 = 10
            r5 = 4
            java.lang.String r3 = r2.getString(r3)
            if (r3 != 0) goto L3e
            r2.getString(r5)
        L3e:
            r3 = 7
            r5 = 5
            int r4 = r2.getResourceId(r5, r4)
            r2.getResourceId(r3, r4)
            r2.recycle()
            return
    }
}
