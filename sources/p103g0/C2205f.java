package p103g0;

/* renamed from: g0.f */
/* loaded from: classes.dex */
public final class C2205f extends android.graphics.drawable.Drawable.ConstantState {

    /* renamed from: a */
    public int f10095a;

    /* renamed from: b */
    public android.graphics.drawable.Drawable.ConstantState f10096b;

    /* renamed from: c */
    public android.content.res.ColorStateList f10097c;

    /* renamed from: d */
    public android.graphics.PorterDuff.Mode f10098d;

    public C2205f(p103g0.C2205f r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f10097c = r0
            android.graphics.PorterDuff$Mode r0 = p103g0.C2203d.f10087e0
            r1.f10098d = r0
            if (r2 == 0) goto L1c
            int r0 = r2.f10095a
            r1.f10095a = r0
            android.graphics.drawable.Drawable$ConstantState r0 = r2.f10096b
            r1.f10096b = r0
            android.content.res.ColorStateList r0 = r2.f10097c
            r1.f10097c = r0
            android.graphics.PorterDuff$Mode r2 = r2.f10098d
            r1.f10098d = r2
        L1c:
            return
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
            r2 = this;
            int r0 = r2.f10095a
            android.graphics.drawable.Drawable$ConstantState r1 = r2.f10096b
            if (r1 == 0) goto Lb
            int r1 = r1.getChangingConfigurations()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r0 = r0 | r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public android.graphics.drawable.Drawable newDrawable() {
            r2 = this;
            g0.e r0 = new g0.e
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
            r1 = this;
            g0.e r0 = new g0.e
            r0.<init>(r1, r2)
            return r0
    }
}
