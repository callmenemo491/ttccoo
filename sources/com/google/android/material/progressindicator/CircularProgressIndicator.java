package com.google.android.material.progressindicator;

/* loaded from: classes.dex */
public final class CircularProgressIndicator extends p250o8.AbstractC5158b<p250o8.C5164h> {

    /* renamed from: m0 */
    public static final /* synthetic */ int f6252m0 = 0;

    public CircularProgressIndicator(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 2132017937(0x7f140311, float:1.9674167E38)
            r1 = 2130968797(0x7f0400dd, float:1.7546258E38)
            r3.<init>(r4, r5, r1, r0)
            android.content.Context r4 = r3.getContext()
            S extends o8.c r5 = r3.f20213a0
            o8.h r5 = (p250o8.C5164h) r5
            o8.n r0 = new o8.n
            o8.d r1 = new o8.d
            r1.<init>(r5)
            o8.g r2 = new o8.g
            r2.<init>(r5)
            r0.<init>(r4, r5, r1, r2)
            r3.setIndeterminateDrawable(r0)
            android.content.Context r4 = r3.getContext()
            S extends o8.c r5 = r3.f20213a0
            o8.h r5 = (p250o8.C5164h) r5
            o8.i r0 = new o8.i
            o8.d r1 = new o8.d
            r1.<init>(r5)
            r0.<init>(r4, r5, r1)
            r3.setProgressDrawable(r0)
            return
    }

    @Override // p250o8.AbstractC5158b
    /* renamed from: b */
    public p250o8.AbstractC5159c mo3495b(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            o8.h r0 = new o8.h
            r0.<init>(r2, r3)
            return r0
    }

    public int getIndicatorDirection() {
            r1 = this;
            S extends o8.c r0 = r1.f20213a0
            o8.h r0 = (p250o8.C5164h) r0
            int r0 = r0.f20256i
            return r0
    }

    public int getIndicatorInset() {
            r1 = this;
            S extends o8.c r0 = r1.f20213a0
            o8.h r0 = (p250o8.C5164h) r0
            int r0 = r0.f20255h
            return r0
    }

    public int getIndicatorSize() {
            r1 = this;
            S extends o8.c r0 = r1.f20213a0
            o8.h r0 = (p250o8.C5164h) r0
            int r0 = r0.f20254g
            return r0
    }

    public void setIndicatorDirection(int r2) {
            r1 = this;
            S extends o8.c r0 = r1.f20213a0
            o8.h r0 = (p250o8.C5164h) r0
            r0.f20256i = r2
            r1.invalidate()
            return
    }

    public void setIndicatorInset(int r3) {
            r2 = this;
            S extends o8.c r0 = r2.f20213a0
            r1 = r0
            o8.h r1 = (p250o8.C5164h) r1
            int r1 = r1.f20255h
            if (r1 == r3) goto L10
            o8.h r0 = (p250o8.C5164h) r0
            r0.f20255h = r3
            r2.invalidate()
        L10:
            return
    }

    public void setIndicatorSize(int r3) {
            r2 = this;
            int r0 = r2.getTrackThickness()
            int r0 = r0 * 2
            int r3 = java.lang.Math.max(r3, r0)
            S extends o8.c r0 = r2.f20213a0
            r1 = r0
            o8.h r1 = (p250o8.C5164h) r1
            int r1 = r1.f20254g
            if (r1 == r3) goto L20
            r1 = r0
            o8.h r1 = (p250o8.C5164h) r1
            r1.f20254g = r3
            o8.h r0 = (p250o8.C5164h) r0
            java.util.Objects.requireNonNull(r0)
            r2.invalidate()
        L20:
            return
    }

    @Override // p250o8.AbstractC5158b
    public void setTrackThickness(int r1) {
            r0 = this;
            super.setTrackThickness(r1)
            S extends o8.c r1 = r0.f20213a0
            o8.h r1 = (p250o8.C5164h) r1
            java.util.Objects.requireNonNull(r1)
            return
    }
}
