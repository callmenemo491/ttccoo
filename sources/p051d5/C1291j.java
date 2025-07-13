package p051d5;

/* renamed from: d5.j */
/* loaded from: classes.dex */
public final class C1291j extends p051d5.AbstractC1289h {
    public static final android.os.Parcelable.Creator<p051d5.C1291j> CREATOR = null;

    /* renamed from: Z */
    public final int f6794Z;

    /* renamed from: a0 */
    public final int f6795a0;

    /* renamed from: b0 */
    public final int f6796b0;

    /* renamed from: c0 */
    public final int[] f6797c0;

    /* renamed from: d0 */
    public final int[] f6798d0;

    /* renamed from: d5.j$a */
    public class a implements android.os.Parcelable.Creator<p051d5.C1291j> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p051d5.C1291j createFromParcel(android.os.Parcel r2) {
                r1 = this;
                d5.j r0 = new d5.j
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public p051d5.C1291j[] newArray(int r1) {
                r0 = this;
                d5.j[] r1 = new p051d5.C1291j[r1]
                return r1
        }
    }

    static {
            d5.j$a r0 = new d5.j$a
            r0.<init>()
            p051d5.C1291j.CREATOR = r0
            return
    }

    public C1291j(int r2, int r3, int r4, int[] r5, int[] r6) {
            r1 = this;
            java.lang.String r0 = "MLLT"
            r1.<init>(r0)
            r1.f6794Z = r2
            r1.f6795a0 = r3
            r1.f6796b0 = r4
            r1.f6797c0 = r5
            r1.f6798d0 = r6
            return
    }

    public C1291j(android.os.Parcel r3) {
            r2 = this;
            java.lang.String r0 = "MLLT"
            r2.<init>(r0)
            int r0 = r3.readInt()
            r2.f6794Z = r0
            int r0 = r3.readInt()
            r2.f6795a0 = r0
            int r0 = r3.readInt()
            r2.f6796b0 = r0
            int[] r0 = r3.createIntArray()
            int r1 = p371v5.C6552b0.f25624a
            r2.f6797c0 = r0
            int[] r3 = r3.createIntArray()
            r2.f6798d0 = r3
            return
    }

    @Override // p051d5.AbstractC1289h, android.os.Parcelable
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
            if (r5 == 0) goto L3b
            java.lang.Class<d5.j> r2 = p051d5.C1291j.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L3b
        L10:
            d5.j r5 = (p051d5.C1291j) r5
            int r2 = r4.f6794Z
            int r3 = r5.f6794Z
            if (r2 != r3) goto L39
            int r2 = r4.f6795a0
            int r3 = r5.f6795a0
            if (r2 != r3) goto L39
            int r2 = r4.f6796b0
            int r3 = r5.f6796b0
            if (r2 != r3) goto L39
            int[] r2 = r4.f6797c0
            int[] r3 = r5.f6797c0
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L39
            int[] r2 = r4.f6798d0
            int[] r5 = r5.f6798d0
            boolean r5 = java.util.Arrays.equals(r2, r5)
            if (r5 == 0) goto L39
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
        L3b:
            return r1
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.f6794Z
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.f6795a0
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r2.f6796b0
            int r1 = r1 + r0
            int r1 = r1 * 31
            int[] r0 = r2.f6797c0
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 * 31
            int[] r1 = r2.f6798d0
            int r1 = java.util.Arrays.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            int r2 = r0.f6794Z
            r1.writeInt(r2)
            int r2 = r0.f6795a0
            r1.writeInt(r2)
            int r2 = r0.f6796b0
            r1.writeInt(r2)
            int[] r2 = r0.f6797c0
            r1.writeIntArray(r2)
            int[] r2 = r0.f6798d0
            r1.writeIntArray(r2)
            return
    }
}
