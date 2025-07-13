package p057db;

/* renamed from: db.y */
/* loaded from: classes.dex */
public class C1424y implements android.os.Parcelable.Creator<p057db.C1423x> {
    public C1424y() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public p057db.C1423x createFromParcel(android.os.Parcel r6) {
            r5 = this;
            int r0 = p270p6.C5368b.m11710t(r6)
            r1 = 0
        L5:
            int r2 = r6.dataPosition()
            if (r2 >= r0) goto L1f
            int r2 = r6.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            r4 = 2
            if (r3 == r4) goto L1a
            p270p6.C5368b.m11709s(r6, r2)
            goto L5
        L1a:
            android.os.Bundle r1 = p270p6.C5368b.m11691a(r6, r2)
            goto L5
        L1f:
            p270p6.C5368b.m11699i(r6, r0)
            db.x r6 = new db.x
            r6.<init>(r1)
            return r6
    }

    @Override // android.os.Parcelable.Creator
    public p057db.C1423x[] newArray(int r1) {
            r0 = this;
            db.x[] r1 = new p057db.C1423x[r1]
            return r1
    }
}
