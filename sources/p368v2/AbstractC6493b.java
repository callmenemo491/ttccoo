package p368v2;

import android.graphics.drawable.Drawable;

/* renamed from: v2.b */
/* loaded from: classes.dex */
public abstract class AbstractC6493b<T extends android.graphics.drawable.Drawable> implements p214m2.InterfaceC4345w<T>, p214m2.InterfaceC4342t {

    /* renamed from: Y */
    public final T f25176Y;

    public AbstractC6493b(T r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r2, r0)
            r1.f25176Y = r2
            return
    }

    @Override // p214m2.InterfaceC4342t
    /* renamed from: b */
    public void mo9729b() {
            r2 = this;
            T extends android.graphics.drawable.Drawable r0 = r2.f25176Y
            boolean r1 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r1 == 0) goto Ld
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            goto L17
        Ld:
            boolean r1 = r0 instanceof p404x2.C6914c
            if (r1 == 0) goto L1a
            x2.c r0 = (p404x2.C6914c) r0
            android.graphics.Bitmap r0 = r0.m14020b()
        L17:
            r0.prepareToDraw()
        L1a:
            return
    }

    @Override // p214m2.InterfaceC4345w
    public java.lang.Object get() {
            r1 = this;
            T extends android.graphics.drawable.Drawable r0 = r1.f25176Y
            android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
            if (r0 != 0) goto Lb
            T extends android.graphics.drawable.Drawable r0 = r1.f25176Y
            goto Lf
        Lb:
            android.graphics.drawable.Drawable r0 = r0.newDrawable()
        Lf:
            return r0
    }
}
