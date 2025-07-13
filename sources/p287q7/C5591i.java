package p287q7;

/* renamed from: q7.i */
/* loaded from: classes.dex */
public final class C5591i implements android.os.Parcelable.Creator<p287q7.C5592j> {
    public C5591i() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p287q7.C5592j createFromParcel(android.os.Parcel r7) {
            r6 = this;
            int r0 = p270p6.C5368b.m11710t(r7)
            r1 = 0
            r2 = r1
        L6:
            int r3 = r7.dataPosition()
            if (r3 >= r0) goto L28
            int r3 = r7.readInt()
            r4 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r3
            r5 = 1
            if (r4 == r5) goto L23
            r5 = 2
            if (r4 == r5) goto L1e
            p270p6.C5368b.m11709s(r7, r3)
            goto L6
        L1e:
            java.lang.String r2 = p270p6.C5368b.m11695e(r7, r3)
            goto L6
        L23:
            java.util.ArrayList r1 = p270p6.C5368b.m11696f(r7, r3)
            goto L6
        L28:
            p270p6.C5368b.m11699i(r7, r0)
            q7.j r7 = new q7.j
            r7.<init>(r1, r2)
            return r7
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p287q7.C5592j[] newArray(int r1) {
            r0 = this;
            q7.j[] r1 = new p287q7.C5592j[r1]
            return r1
    }
}
