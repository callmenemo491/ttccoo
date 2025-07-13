package p337t5;

/* renamed from: t5.h */
/* loaded from: classes.dex */
public final class C6178h {
    /* renamed from: a */
    public static void m12746a(p143i5.C3077a.b r6) {
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r6.f12413k = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r6.f12412j = r0
            java.lang.CharSequence r0 = r6.f12403a
            boolean r1 = r0 instanceof android.text.Spanned
            if (r1 == 0) goto L45
            boolean r1 = r0 instanceof android.text.Spannable
            if (r1 != 0) goto L19
            android.text.SpannableString r0 = android.text.SpannableString.valueOf(r0)
            r6.f12403a = r0
        L19:
            java.lang.CharSequence r6 = r6.f12403a
            java.util.Objects.requireNonNull(r6)
            android.text.Spannable r6 = (android.text.Spannable) r6
            int r0 = r6.length()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2 = 0
            java.lang.Object[] r0 = r6.getSpans(r2, r0, r1)
            int r1 = r0.length
            r3 = 0
        L2d:
            if (r3 >= r1) goto L45
            r4 = r0[r3]
            boolean r5 = r4 instanceof android.text.style.AbsoluteSizeSpan
            if (r5 != 0) goto L3c
            boolean r5 = r4 instanceof android.text.style.RelativeSizeSpan
            if (r5 == 0) goto L3a
            goto L3c
        L3a:
            r5 = 0
            goto L3d
        L3c:
            r5 = 1
        L3d:
            if (r5 == 0) goto L42
            r6.removeSpan(r4)
        L42:
            int r3 = r3 + 1
            goto L2d
        L45:
            return
    }

    /* renamed from: b */
    public static float m12747b(int r2, float r3, int r4, int r5) {
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 != 0) goto L8
            return r0
        L8:
            if (r2 == 0) goto L16
            r5 = 1
            if (r2 == r5) goto L12
            r4 = 2
            if (r2 == r4) goto L11
            return r0
        L11:
            return r3
        L12:
            float r2 = (float) r4
        L13:
            float r3 = r3 * r2
            return r3
        L16:
            float r2 = (float) r5
            goto L13
    }
}
