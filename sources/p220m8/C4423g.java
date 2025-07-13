package p220m8;

/* renamed from: m8.g */
/* loaded from: classes.dex */
public class C4423g extends android.util.SparseArray<android.os.Parcelable> implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<p220m8.C4423g> CREATOR = null;

    /* renamed from: m8.g$a */
    public static class a implements android.os.Parcelable.ClassLoaderCreator<p220m8.C4423g> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public java.lang.Object createFromParcel(android.os.Parcel r3) {
                r2 = this;
                m8.g r0 = new m8.g
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public p220m8.C4423g createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                r1 = this;
                m8.g r0 = new m8.g
                r0.<init>(r2, r3)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public java.lang.Object[] newArray(int r1) {
                r0 = this;
                m8.g[] r1 = new p220m8.C4423g[r1]
                return r1
        }
    }

    static {
            m8.g$a r0 = new m8.g$a
            r0.<init>()
            p220m8.C4423g.CREATOR = r0
            return
    }

    public C4423g() {
            r0 = this;
            r0.<init>()
            return
    }

    public C4423g(android.os.Parcel r5, java.lang.ClassLoader r6) {
            r4 = this;
            r4.<init>()
            int r0 = r5.readInt()
            int[] r1 = new int[r0]
            r5.readIntArray(r1)
            android.os.Parcelable[] r5 = r5.readParcelableArray(r6)
            r6 = 0
        L11:
            if (r6 >= r0) goto L1d
            r2 = r1[r6]
            r3 = r5[r6]
            r4.put(r2, r3)
            int r6 = r6 + 1
            goto L11
        L1d:
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r6, int r7) {
            r5 = this;
            int r0 = r5.size()
            int[] r1 = new int[r0]
            android.os.Parcelable[] r2 = new android.os.Parcelable[r0]
            r3 = 0
        L9:
            if (r3 >= r0) goto L1c
            int r4 = r5.keyAt(r3)
            r1[r3] = r4
            java.lang.Object r4 = r5.valueAt(r3)
            android.os.Parcelable r4 = (android.os.Parcelable) r4
            r2[r3] = r4
            int r3 = r3 + 1
            goto L9
        L1c:
            r6.writeInt(r0)
            r6.writeIntArray(r1)
            r6.writeParcelableArray(r2, r7)
            return
    }
}
