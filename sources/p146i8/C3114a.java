package p146i8;

/* renamed from: i8.a */
/* loaded from: classes.dex */
public final class C3114a {
    /* renamed from: a */
    public static android.graphics.PorterDuffColorFilter m7572a(android.graphics.drawable.Drawable r1, android.content.res.ColorStateList r2, android.graphics.PorterDuff.Mode r3) {
            if (r2 == 0) goto L14
            if (r3 != 0) goto L5
            goto L14
        L5:
            int[] r1 = r1.getState()
            r0 = 0
            int r1 = r2.getColorForState(r1, r0)
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            r2.<init>(r1, r3)
            return r2
        L14:
            r1 = 0
            return r1
    }
}
