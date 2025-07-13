package p288q8;

/* renamed from: q8.c */
/* loaded from: classes.dex */
public class C5599c {
    /* renamed from: a */
    public static android.content.res.ColorStateList m11875a(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L14
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L14
            android.content.res.ColorStateList r1 = p102g.C2199a.m5783a(r1, r0)
            if (r1 == 0) goto L14
            return r1
        L14:
            android.content.res.ColorStateList r1 = r2.getColorStateList(r3)
            return r1
    }

    /* renamed from: b */
    public static android.content.res.ColorStateList m11876b(android.content.Context r2, androidx.appcompat.widget.C0314y0 r3, int r4) {
            android.content.res.TypedArray r0 = r3.f1501b
            boolean r0 = r0.hasValue(r4)
            if (r0 == 0) goto L18
            r0 = 0
            android.content.res.TypedArray r1 = r3.f1501b
            int r0 = r1.getResourceId(r4, r0)
            if (r0 == 0) goto L18
            android.content.res.ColorStateList r2 = p102g.C2199a.m5783a(r2, r0)
            if (r2 == 0) goto L18
            return r2
        L18:
            android.content.res.ColorStateList r2 = r3.m851c(r4)
            return r2
    }

    /* renamed from: c */
    public static int m11877c(android.content.Context r3, android.content.res.TypedArray r4, int r5, int r6) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            boolean r1 = r4.getValue(r5, r0)
            if (r1 == 0) goto L29
            int r1 = r0.type
            r2 = 2
            if (r1 == r2) goto L11
            goto L29
        L11:
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r4 = 1
            int[] r4 = new int[r4]
            int r5 = r0.data
            r0 = 0
            r4[r0] = r5
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4)
            int r4 = r3.getDimensionPixelSize(r0, r6)
            r3.recycle()
            return r4
        L29:
            int r3 = r4.getDimensionPixelSize(r5, r6)
            return r3
    }

    /* renamed from: d */
    public static android.graphics.drawable.Drawable m11878d(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L14
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L14
            android.graphics.drawable.Drawable r1 = p102g.C2199a.m5784b(r1, r0)
            if (r1 == 0) goto L14
            return r1
        L14:
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r3)
            return r1
    }

    /* renamed from: e */
    public static boolean m11879e(android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            float r1 = r1.fontScale
            r0 = 1067869798(0x3fa66666, float:1.3)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 < 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    /* renamed from: f */
    public static boolean m11880f(android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            float r1 = r1.fontScale
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 < 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }
}
