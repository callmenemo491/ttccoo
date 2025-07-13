package p198l3;

/* renamed from: l3.f */
/* loaded from: classes.dex */
public class C4172f extends p198l3.AbstractC4169c implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p198l3.C4172f> CREATOR = null;

    /* renamed from: a0 */
    public float f17288a0;

    /* renamed from: l3.f$a */
    public static class a implements android.os.Parcelable.Creator<p198l3.C4172f> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p198l3.C4172f createFromParcel(android.os.Parcel r2) {
                r1 = this;
                l3.f r0 = new l3.f
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public p198l3.C4172f[] newArray(int r1) {
                r0 = this;
                l3.f[] r1 = new p198l3.C4172f[r1]
                return r1
        }
    }

    static {
            l3.f$a r0 = new l3.f$a
            r0.<init>()
            p198l3.C4172f.CREATOR = r0
            return
    }

    public C4172f() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f17288a0 = r0
            return
    }

    public C4172f(float r1, float r2) {
            r0 = this;
            r0.<init>(r2)
            r2 = 0
            r0.f17288a0 = r2
            r0.f17288a0 = r1
            return
    }

    public C4172f(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f17288a0 = r0
            float r0 = r3.readFloat()
            r2.f17288a0 = r0
            float r0 = r3.readFloat()
            r2.f17268Y = r0
            int r0 = r3.readInt()
            r1 = 1
            if (r0 != r1) goto L25
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r3 = r3.readParcelable(r0)
            r2.f17269Z = r3
        L25:
            return
    }

    /* renamed from: b */
    public float mo9267b() {
            r1 = this;
            float r0 = r1.f17288a0
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Entry, x: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            float r1 = r2.f17288a0
            r0.append(r1)
            java.lang.String r1 = " y: "
            r0.append(r1)
            float r1 = r2.m9246a()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            float r0 = r1.f17288a0
            r2.writeFloat(r0)
            float r0 = r1.m9246a()
            r2.writeFloat(r0)
            java.lang.Object r0 = r1.f17269Z
            if (r0 == 0) goto L28
            boolean r0 = r0 instanceof android.os.Parcelable
            if (r0 == 0) goto L20
            r0 = 1
            r2.writeInt(r0)
            java.lang.Object r0 = r1.f17269Z
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r2.writeParcelable(r0, r3)
            goto L2c
        L20:
            android.os.ParcelFormatException r2 = new android.os.ParcelFormatException
            java.lang.String r3 = "Cannot parcel an Entry with non-parcelable data"
            r2.<init>(r3)
            throw r2
        L28:
            r3 = 0
            r2.writeInt(r3)
        L2c:
            return
    }
}
