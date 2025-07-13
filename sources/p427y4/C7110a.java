package p427y4;

/* renamed from: y4.a */
/* loaded from: classes.dex */
public final class C7110a implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p427y4.C7110a> CREATOR = null;

    /* renamed from: Y */
    public final p427y4.C7110a.b[] f27506Y;

    /* renamed from: y4.a$a */
    public class a implements android.os.Parcelable.Creator<p427y4.C7110a> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p427y4.C7110a createFromParcel(android.os.Parcel r2) {
                r1 = this;
                y4.a r0 = new y4.a
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public p427y4.C7110a[] newArray(int r1) {
                r0 = this;
                y4.a[] r1 = new p427y4.C7110a[r1]
                return r1
        }
    }

    /* renamed from: y4.a$b */
    public interface b extends android.os.Parcelable {
        /* renamed from: D */
        p088f4.C2003e0 mo30D();

        /* renamed from: O */
        byte[] mo31O();

        /* renamed from: p */
        void mo32p(p088f4.C2021k0.b r1);
    }

    static {
            y4.a$a r0 = new y4.a$a
            r0.<init>()
            p427y4.C7110a.CREATOR = r0
            return
    }

    public C7110a(android.os.Parcel r4) {
            r3 = this;
            r3.<init>()
            int r0 = r4.readInt()
            y4.a$b[] r0 = new p427y4.C7110a.b[r0]
            r3.f27506Y = r0
            r0 = 0
        Lc:
            y4.a$b[] r1 = r3.f27506Y
            int r2 = r1.length
            if (r0 >= r2) goto L22
            java.lang.Class<y4.a$b> r2 = p427y4.C7110a.b.class
            java.lang.ClassLoader r2 = r2.getClassLoader()
            android.os.Parcelable r2 = r4.readParcelable(r2)
            y4.a$b r2 = (p427y4.C7110a.b) r2
            r1[r0] = r2
            int r0 = r0 + 1
            goto Lc
        L22:
            return
    }

    public C7110a(java.util.List<? extends p427y4.C7110a.b> r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            y4.a$b[] r0 = new p427y4.C7110a.b[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            y4.a$b[] r2 = (p427y4.C7110a.b[]) r2
            r1.f27506Y = r2
            return
    }

    public C7110a(p427y4.C7110a.b... r1) {
            r0 = this;
            r0.<init>()
            r0.f27506Y = r1
            return
    }

    /* renamed from: a */
    public p427y4.C7110a m14220a(p427y4.C7110a.b... r6) {
            r5 = this;
            int r0 = r6.length
            if (r0 != 0) goto L4
            return r5
        L4:
            y4.a r0 = new y4.a
            y4.a$b[] r1 = r5.f27506Y
            int r2 = p371v5.C6552b0.f25624a
            int r2 = r1.length
            int r3 = r6.length
            int r2 = r2 + r3
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r1, r2)
            int r1 = r1.length
            int r3 = r6.length
            r4 = 0
            java.lang.System.arraycopy(r6, r4, r2, r1, r3)
            y4.a$b[] r2 = (p427y4.C7110a.b[]) r2
            r0.<init>(r2)
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<y4.a> r0 = p427y4.C7110a.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            y4.a r3 = (p427y4.C7110a) r3
            y4.a$b[] r0 = r2.f27506Y
            y4.a$b[] r3 = r3.f27506Y
            boolean r3 = java.util.Arrays.equals(r0, r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r1 = this;
            y4.a$b[] r0 = r1.f27506Y
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            y4.a$b[] r0 = r3.f27506Y
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.String r2 = "entries="
            if (r1 == 0) goto L17
            java.lang.String r0 = r2.concat(r0)
            goto L1c
        L17:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
        L1c:
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            y4.a$b[] r6 = r4.f27506Y
            int r6 = r6.length
            r5.writeInt(r6)
            y4.a$b[] r6 = r4.f27506Y
            int r0 = r6.length
            r1 = 0
            r2 = 0
        Lb:
            if (r2 >= r0) goto L15
            r3 = r6[r2]
            r5.writeParcelable(r3, r1)
            int r2 = r2 + 1
            goto Lb
        L15:
            return
    }
}
