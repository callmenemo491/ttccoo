package p070e5;

/* renamed from: e5.e */
/* loaded from: classes.dex */
public final class C1520e implements p427y4.C7110a.b {
    public static final android.os.Parcelable.Creator<p070e5.C1520e> CREATOR = null;

    /* renamed from: Y */
    public final float f7381Y;

    /* renamed from: Z */
    public final int f7382Z;

    /* renamed from: e5.e$a */
    public class a implements android.os.Parcelable.Creator<p070e5.C1520e> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p070e5.C1520e createFromParcel(android.os.Parcel r3) {
                r2 = this;
                e5.e r0 = new e5.e
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public p070e5.C1520e[] newArray(int r1) {
                r0 = this;
                e5.e[] r1 = new p070e5.C1520e[r1]
                return r1
        }
    }

    static {
            e5.e$a r0 = new e5.e$a
            r0.<init>()
            p070e5.C1520e.CREATOR = r0
            return
    }

    public C1520e(float r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f7381Y = r1
            r0.f7382Z = r2
            return
    }

    public C1520e(android.os.Parcel r1, p070e5.C1520e.a r2) {
            r0 = this;
            r0.<init>()
            float r2 = r1.readFloat()
            r0.f7381Y = r2
            int r1 = r1.readInt()
            r0.f7382Z = r1
            return
    }

    @Override // p427y4.C7110a.b
    /* renamed from: D */
    public /* synthetic */ p088f4.C2003e0 mo30D() {
            r1 = this;
            f4.e0 r0 = p427y4.C7111b.m14222b(r1)
            return r0
    }

    @Override // p427y4.C7110a.b
    /* renamed from: O */
    public /* synthetic */ byte[] mo31O() {
            r1 = this;
            byte[] r0 = p427y4.C7111b.m14221a(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L23
            java.lang.Class<e5.e> r2 = p070e5.C1520e.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L23
        L10:
            e5.e r5 = (p070e5.C1520e) r5
            float r2 = r4.f7381Y
            float r3 = r5.f7381Y
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L21
            int r2 = r4.f7382Z
            int r5 = r5.f7382Z
            if (r2 != r5) goto L21
            goto L22
        L21:
            r0 = 0
        L22:
            return r0
        L23:
            return r1
    }

    public int hashCode() {
            r2 = this;
            float r0 = r2.f7381Y
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            int r0 = r0.hashCode()
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.f7382Z
            int r1 = r1 + r0
            return r1
    }

    @Override // p427y4.C7110a.b
    /* renamed from: p */
    public /* synthetic */ void mo32p(p088f4.C2021k0.b r1) {
            r0 = this;
            p427y4.C7111b.m14223c(r0, r1)
            return
    }

    public java.lang.String toString() {
            r4 = this;
            float r0 = r4.f7381Y
            int r1 = r4.f7382Z
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 73
            r2.<init>(r3)
            java.lang.String r3 = "smta: captureFrameRate="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ", svcTemporalLayerCount="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            float r2 = r0.f7381Y
            r1.writeFloat(r2)
            int r2 = r0.f7382Z
            r1.writeInt(r2)
            return
    }
}
