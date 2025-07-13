package p051d5;

/* renamed from: d5.f */
/* loaded from: classes.dex */
public final class C1287f extends p051d5.AbstractC1289h {
    public static final android.os.Parcelable.Creator<p051d5.C1287f> CREATOR = null;

    /* renamed from: Z */
    public final java.lang.String f6781Z;

    /* renamed from: a0 */
    public final java.lang.String f6782a0;

    /* renamed from: b0 */
    public final java.lang.String f6783b0;

    /* renamed from: c0 */
    public final byte[] f6784c0;

    /* renamed from: d5.f$a */
    public class a implements android.os.Parcelable.Creator<p051d5.C1287f> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p051d5.C1287f createFromParcel(android.os.Parcel r2) {
                r1 = this;
                d5.f r0 = new d5.f
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public p051d5.C1287f[] newArray(int r1) {
                r0 = this;
                d5.f[] r1 = new p051d5.C1287f[r1]
                return r1
        }
    }

    static {
            d5.f$a r0 = new d5.f$a
            r0.<init>()
            p051d5.C1287f.CREATOR = r0
            return
    }

    public C1287f(android.os.Parcel r3) {
            r2 = this;
            java.lang.String r0 = "GEOB"
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            int r1 = p371v5.C6552b0.f25624a
            r2.f6781Z = r0
            java.lang.String r0 = r3.readString()
            r2.f6782a0 = r0
            java.lang.String r0 = r3.readString()
            r2.f6783b0 = r0
            byte[] r3 = r3.createByteArray()
            r2.f6784c0 = r3
            return
    }

    public C1287f(java.lang.String r2, java.lang.String r3, java.lang.String r4, byte[] r5) {
            r1 = this;
            java.lang.String r0 = "GEOB"
            r1.<init>(r0)
            r1.f6781Z = r2
            r1.f6782a0 = r3
            r1.f6783b0 = r4
            r1.f6784c0 = r5
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L3d
            java.lang.Class<d5.f> r2 = p051d5.C1287f.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L3d
        L10:
            d5.f r5 = (p051d5.C1287f) r5
            java.lang.String r2 = r4.f6781Z
            java.lang.String r3 = r5.f6781Z
            boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
            if (r2 == 0) goto L3b
            java.lang.String r2 = r4.f6782a0
            java.lang.String r3 = r5.f6782a0
            boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
            if (r2 == 0) goto L3b
            java.lang.String r2 = r4.f6783b0
            java.lang.String r3 = r5.f6783b0
            boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
            if (r2 == 0) goto L3b
            byte[] r2 = r4.f6784c0
            byte[] r5 = r5.f6784c0
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L3b
            goto L3c
        L3b:
            r0 = 0
        L3c:
            return r0
        L3d:
            return r1
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f6781Z
            r1 = 0
            if (r0 == 0) goto La
            int r0 = r0.hashCode()
            goto Lb
        La:
            r0 = 0
        Lb:
            r2 = 527(0x20f, float:7.38E-43)
            int r2 = r2 + r0
            int r2 = r2 * 31
            java.lang.String r0 = r3.f6782a0
            if (r0 == 0) goto L19
            int r0 = r0.hashCode()
            goto L1a
        L19:
            r0 = 0
        L1a:
            int r2 = r2 + r0
            int r2 = r2 * 31
            java.lang.String r0 = r3.f6783b0
            if (r0 == 0) goto L25
            int r1 = r0.hashCode()
        L25:
            int r2 = r2 + r1
            int r2 = r2 * 31
            byte[] r0 = r3.f6784c0
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 + r2
            return r0
    }

    @Override // p051d5.AbstractC1289h
    public java.lang.String toString() {
            r7 = this;
            java.lang.String r0 = r7.f6790Y
            java.lang.String r1 = r7.f6781Z
            java.lang.String r2 = r7.f6782a0
            java.lang.String r3 = r7.f6783b0
            r4 = 36
            int r4 = p064e.C1489c.m4038a(r0, r4)
            int r4 = p064e.C1489c.m4038a(r1, r4)
            int r4 = p064e.C1489c.m4038a(r2, r4)
            int r4 = p064e.C1489c.m4038a(r3, r4)
            java.lang.String r5 = ": mimeType="
            java.lang.String r6 = ", filename="
            java.lang.StringBuilder r0 = p064e.C1491e.m4040a(r4, r0, r5, r1, r6)
            java.lang.String r1 = ", description="
            java.lang.String r0 = p083f.C1932s.m4774a(r0, r2, r1, r3)
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.f6781Z
            r1.writeString(r2)
            java.lang.String r2 = r0.f6782a0
            r1.writeString(r2)
            java.lang.String r2 = r0.f6783b0
            r1.writeString(r2)
            byte[] r2 = r0.f6784c0
            r1.writeByteArray(r2)
            return
    }
}
