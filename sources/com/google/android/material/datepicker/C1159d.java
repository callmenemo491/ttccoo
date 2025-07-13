package com.google.android.material.datepicker;

/* renamed from: com.google.android.material.datepicker.d */
/* loaded from: classes.dex */
public class C1159d implements com.google.android.material.datepicker.C1154a.c {
    public static final android.os.Parcelable.Creator<com.google.android.material.datepicker.C1159d> CREATOR = null;

    /* renamed from: Y */
    public final long f6063Y;

    /* renamed from: com.google.android.material.datepicker.d$a */
    public static class a implements android.os.Parcelable.Creator<com.google.android.material.datepicker.C1159d> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public com.google.android.material.datepicker.C1159d createFromParcel(android.os.Parcel r4) {
                r3 = this;
                com.google.android.material.datepicker.d r0 = new com.google.android.material.datepicker.d
                long r1 = r4.readLong()
                r4 = 0
                r0.<init>(r1, r4)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public com.google.android.material.datepicker.C1159d[] newArray(int r1) {
                r0 = this;
                com.google.android.material.datepicker.d[] r1 = new com.google.android.material.datepicker.C1159d[r1]
                return r1
        }
    }

    static {
            com.google.android.material.datepicker.d$a r0 = new com.google.android.material.datepicker.d$a
            r0.<init>()
            com.google.android.material.datepicker.C1159d.CREATOR = r0
            return
    }

    public C1159d(long r1) {
            r0 = this;
            r0.<init>()
            r0.f6063Y = r1
            return
    }

    public C1159d(long r1, com.google.android.material.datepicker.C1159d.a r3) {
            r0 = this;
            r0.<init>()
            r0.f6063Y = r1
            return
    }

    @Override // com.google.android.material.datepicker.C1154a.c
    /* renamed from: A */
    public boolean mo3400A(long r4) {
            r3 = this;
            long r0 = r3.f6063Y
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L8
            r4 = 1
            goto L9
        L8:
            r4 = 0
        L9:
            return r4
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.google.android.material.datepicker.C1159d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.material.datepicker.d r8 = (com.google.android.material.datepicker.C1159d) r8
            long r3 = r7.f6063Y
            long r5 = r8.f6063Y
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r1 = r3.f6063Y
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            long r0 = r2.f6063Y
            r3.writeLong(r0)
            return
    }
}
