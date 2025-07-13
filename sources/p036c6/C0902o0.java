package p036c6;

/* renamed from: c6.o0 */
/* loaded from: classes.dex */
public final class C0902o0 implements android.os.Parcelable.Creator<p036c6.C0893k> {
    public C0902o0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p036c6.C0893k createFromParcel(android.os.Parcel r8) {
            r7 = this;
            int r0 = p270p6.C5368b.m11710t(r8)
            r1 = 0
            r2 = 0
            r2 = r1
            r3 = 0
        L8:
            int r4 = r8.dataPosition()
            if (r4 >= r0) goto L34
            int r4 = r8.readInt()
            r5 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r4
            r6 = 2
            if (r5 == r6) goto L2d
            r6 = 3
            if (r5 == r6) goto L28
            r6 = 4
            if (r5 == r6) goto L23
            p270p6.C5368b.m11709s(r8, r4)
            goto L8
        L23:
            int r3 = p270p6.C5368b.m11705o(r8, r4)
            goto L8
        L28:
            android.os.Bundle r2 = p270p6.C5368b.m11691a(r8, r4)
            goto L8
        L2d:
            android.os.Parcelable$Creator<n6.a> r1 = p233n6.C4691a.CREATOR
            java.util.ArrayList r1 = p270p6.C5368b.m11698h(r8, r4, r1)
            goto L8
        L34:
            p270p6.C5368b.m11699i(r8, r0)
            c6.k r8 = new c6.k
            r8.<init>(r1, r2, r3)
            return r8
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p036c6.C0893k[] newArray(int r1) {
            r0 = this;
            c6.k[] r1 = new p036c6.C0893k[r1]
            return r1
    }
}
