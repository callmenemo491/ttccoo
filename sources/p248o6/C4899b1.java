package p248o6;

/* renamed from: o6.b1 */
/* loaded from: classes.dex */
public final class C4899b1 implements android.os.Parcelable.Creator<p248o6.C4896a1> {
    public C4899b1() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p248o6.C4896a1 createFromParcel(android.os.Parcel r6) {
            r5 = this;
            int r0 = p270p6.C5368b.m11710t(r6)
            r1 = 0
        L5:
            int r2 = r6.dataPosition()
            if (r2 >= r0) goto L1f
            int r2 = r6.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            r4 = 1
            if (r3 == r4) goto L1a
            p270p6.C5368b.m11709s(r6, r2)
            goto L5
        L1a:
            int r1 = p270p6.C5368b.m11705o(r6, r2)
            goto L5
        L1f:
            p270p6.C5368b.m11699i(r6, r0)
            o6.a1 r6 = new o6.a1
            r6.<init>(r1)
            return r6
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p248o6.C4896a1[] newArray(int r1) {
            r0 = this;
            o6.a1[] r1 = new p248o6.C4896a1[r1]
            return r1
    }
}
