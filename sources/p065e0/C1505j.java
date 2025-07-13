package p065e0;

/* renamed from: e0.j */
/* loaded from: classes.dex */
public class C1505j {
    /* renamed from: a */
    public static int m4087a(android.content.Context r2, int r3, int r4) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r1 = 1
            r2.resolveAttribute(r3, r0, r1)
            int r2 = r0.resourceId
            if (r2 == 0) goto L12
            return r3
        L12:
            return r4
    }

    /* renamed from: b */
    public static boolean m4088b(android.content.res.TypedArray r0, int r1, int r2, boolean r3) {
            boolean r2 = r0.getBoolean(r2, r3)
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }

    /* renamed from: c */
    public static p065e0.C1500e m4089c(android.content.res.TypedArray r2, org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources.Theme r4, java.lang.String r5, int r6, int r7) {
            boolean r3 = m4094h(r3, r5)
            r5 = 0
            if (r3 == 0) goto L3b
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.getValue(r6, r3)
            int r0 = r3.type
            r1 = 28
            if (r0 < r1) goto L21
            r1 = 31
            if (r0 > r1) goto L21
            int r2 = r3.data
            e0.e r3 = new e0.e
            r3.<init>(r5, r5, r2)
            return r3
        L21:
            android.content.res.Resources r3 = r2.getResources()
            r0 = 0
            int r2 = r2.getResourceId(r6, r0)
            e0.e r2 = p065e0.C1500e.m4074a(r3, r2, r4)     // Catch: java.lang.Exception -> L2f
            goto L38
        L2f:
            r2 = move-exception
            java.lang.String r3 = "ComplexColorCompat"
            java.lang.String r4 = "Failed to inflate ComplexColor."
            android.util.Log.e(r3, r4, r2)
            r2 = r5
        L38:
            if (r2 == 0) goto L3b
            return r2
        L3b:
            e0.e r2 = new e0.e
            r2.<init>(r5, r5, r7)
            return r2
    }

    /* renamed from: d */
    public static java.lang.String m4090d(android.content.res.TypedArray r0, org.xmlpull.v1.XmlPullParser r1, java.lang.String r2, int r3) {
            boolean r1 = m4094h(r1, r2)
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r0 = r0.getString(r3)
            return r0
    }

    /* renamed from: e */
    public static int m4091e(android.content.res.TypedArray r0, int r1, int r2, int r3) {
            int r2 = r0.getResourceId(r2, r3)
            int r0 = r0.getResourceId(r1, r2)
            return r0
    }

    /* renamed from: f */
    public static java.lang.String m4092f(android.content.res.TypedArray r0, int r1, int r2) {
            java.lang.String r1 = r0.getString(r1)
            if (r1 != 0) goto La
            java.lang.String r1 = r0.getString(r2)
        La:
            return r1
    }

    /* renamed from: g */
    public static java.lang.CharSequence[] m4093g(android.content.res.TypedArray r0, int r1, int r2) {
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 != 0) goto La
            java.lang.CharSequence[] r1 = r0.getTextArray(r2)
        La:
            return r1
    }

    /* renamed from: h */
    public static boolean m4094h(org.xmlpull.v1.XmlPullParser r1, java.lang.String r2) {
            java.lang.String r0 = "http://schemas.android.com/apk/res/android"
            java.lang.String r1 = r1.getAttributeValue(r0, r2)
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    /* renamed from: i */
    public static android.content.res.TypedArray m4095i(android.content.res.Resources r0, android.content.res.Resources.Theme r1, android.util.AttributeSet r2, int[] r3) {
            if (r1 != 0) goto L7
            android.content.res.TypedArray r0 = r0.obtainAttributes(r2, r3)
            return r0
        L7:
            r0 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r3, r0, r0)
            return r0
    }
}
