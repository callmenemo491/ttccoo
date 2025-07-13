package com.google.android.material.internal;

/* loaded from: classes.dex */
public class CheckableImageButton extends androidx.appcompat.widget.C0289m implements android.widget.Checkable {

    /* renamed from: f0 */
    public static final int[] f6235f0 = null;

    /* renamed from: c0 */
    public boolean f6236c0;

    /* renamed from: d0 */
    public boolean f6237d0;

    /* renamed from: e0 */
    public boolean f6238e0;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    public static class C1195a extends p320s0.AbstractC5943a {
        public static final android.os.Parcelable.Creator<com.google.android.material.internal.CheckableImageButton.C1195a> CREATOR = null;

        /* renamed from: a0 */
        public boolean f6239a0;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$a$a */
        public static class a implements android.os.Parcelable.ClassLoaderCreator<com.google.android.material.internal.CheckableImageButton.C1195a> {
            public a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public java.lang.Object createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    com.google.android.material.internal.CheckableImageButton$a r0 = new com.google.android.material.internal.CheckableImageButton$a
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public com.google.android.material.internal.CheckableImageButton.C1195a createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    com.google.android.material.internal.CheckableImageButton$a r0 = new com.google.android.material.internal.CheckableImageButton$a
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    com.google.android.material.internal.CheckableImageButton$a[] r1 = new com.google.android.material.internal.CheckableImageButton.C1195a[r1]
                    return r1
            }
        }

        static {
                com.google.android.material.internal.CheckableImageButton$a$a r0 = new com.google.android.material.internal.CheckableImageButton$a$a
                r0.<init>()
                com.google.android.material.internal.CheckableImageButton.C1195a.CREATOR = r0
                return
        }

        public C1195a(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                int r1 = r1.readInt()
                r2 = 1
                if (r1 != r2) goto Lb
                goto Lc
            Lb:
                r2 = 0
            Lc:
                r0.f6239a0 = r2
                return
        }

        public C1195a(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // p320s0.AbstractC5943a, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                android.os.Parcelable r0 = r1.f22819Y
                r2.writeParcelable(r0, r3)
                boolean r3 = r1.f6239a0
                r2.writeInt(r3)
                return
        }
    }

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r0[r1] = r2
            com.google.android.material.internal.CheckableImageButton.f6235f0 = r0
            return
    }

    public CheckableImageButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130969078(0x7f0401f6, float:1.7546828E38)
            r1.<init>(r2, r3, r0)
            r2 = 1
            r1.f6237d0 = r2
            r1.f6238e0 = r2
            m8.a r2 = new m8.a
            r2.<init>(r1)
            p227n0.C4661t.m10546v(r1, r2)
            return
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
            r1 = this;
            boolean r0 = r1.f6236c0
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int r3) {
            r2 = this;
            boolean r0 = r2.f6236c0
            if (r0 == 0) goto L11
            int[] r0 = com.google.android.material.internal.CheckableImageButton.f6235f0
            int r1 = r0.length
            int r3 = r3 + r1
            int[] r3 = super.onCreateDrawableState(r3)
            int[] r3 = android.widget.ImageButton.mergeDrawableStates(r3, r0)
            return r3
        L11:
            int[] r3 = super.onCreateDrawableState(r3)
            return r3
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.internal.CheckableImageButton.C1195a
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.internal.CheckableImageButton$a r2 = (com.google.android.material.internal.CheckableImageButton.C1195a) r2
            android.os.Parcelable r0 = r2.f22819Y
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.f6239a0
            r1.setChecked(r2)
            return
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.internal.CheckableImageButton$a r1 = new com.google.android.material.internal.CheckableImageButton$a
            r1.<init>(r0)
            boolean r0 = r2.f6236c0
            r1.f6239a0 = r0
            return r1
    }

    public void setCheckable(boolean r2) {
            r1 = this;
            boolean r0 = r1.f6237d0
            if (r0 == r2) goto La
            r1.f6237d0 = r2
            r2 = 0
            r1.sendAccessibilityEvent(r2)
        La:
            return
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean r2) {
            r1 = this;
            boolean r0 = r1.f6237d0
            if (r0 == 0) goto L12
            boolean r0 = r1.f6236c0
            if (r0 == r2) goto L12
            r1.f6236c0 = r2
            r1.refreshDrawableState()
            r2 = 2048(0x800, float:2.87E-42)
            r1.sendAccessibilityEvent(r2)
        L12:
            return
    }

    public void setPressable(boolean r1) {
            r0 = this;
            r0.f6238e0 = r1
            return
    }

    @Override // android.view.View
    public void setPressed(boolean r2) {
            r1 = this;
            boolean r0 = r1.f6238e0
            if (r0 == 0) goto L7
            super.setPressed(r2)
        L7:
            return
    }

    @Override // android.widget.Checkable
    public void toggle() {
            r1 = this;
            boolean r0 = r1.f6236c0
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
    }
}
